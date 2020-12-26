package main

import io.reactivex.rxjava3.core.BackpressureStrategy
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit

fun main() {
    flowable()
    flowableInterval()

    onBackPressureBuffer()
    onBackPressureLatest()
    onBackPressureDrop()

    backPressureStrategy()
}

fun flowable() {
    println("== flowable ==")

    val disposable = Flowable.range(1, Int.MAX_VALUE)
        .doOnNext { number ->
            println("아이템 발행 : $number")
        }.observeOn(Schedulers.io())
        .subscribe {
            Thread.sleep(100L)
            println("아이템 소비 : $it")
        }

    Thread.sleep(1000L)
    disposable.dispose()
}

fun flowableInterval() {
    println("== flowable interval ==")

    val disposable = Flowable.interval(10, TimeUnit.MILLISECONDS)
        .observeOn(Schedulers.io())
        .doOnNext { number ->
            Thread.sleep(2000L)
            println("아이템 발행 : $number")
        }.subscribe({
            println("아이템 소비 : $it")
        }, { throwable ->
           println("error : ${throwable.message}")
        })

    Thread.sleep(3000L)
    disposable.dispose()
}

fun onBackPressureBuffer() {
    println("== onBackPressureBuffer ==")

    val disposable = Flowable.interval(10L, TimeUnit.MILLISECONDS)
        .onBackpressureBuffer()
        .observeOn(Schedulers.io())
        .doOnNext { number ->
            Thread.sleep(1000L)
            println("아이템 발행 : $number")
        }.subscribe {
            println("아이템 소비 : $it")
        }

    Thread.sleep(3100L)
    disposable.dispose()
}

fun onBackPressureLatest() {
    println("== onBackPressureLatest ==")

    val disposable = Flowable.interval(1L, TimeUnit.MILLISECONDS)
        .onBackpressureLatest()
        .observeOn(Schedulers.io())
        .subscribe({
            Thread.sleep(10L)
            println("아이템 소비 : $it")
        }, { throwable ->
            println("error : ${throwable.message}")
        })

    Thread.sleep(1500L)
    disposable.dispose()
}

fun onBackPressureDrop() {
    println("== onBackPressureDrop ==")

    val disposable = Flowable.range(1, 300)
        .onBackpressureDrop {
            println("아이템 버림 : $it")
        }.observeOn(Schedulers.io())
        .subscribe({
            Thread.sleep(10L)
            println("아이템 소비 : $it")
        }, { throwable ->
            println("error : ${throwable.message}")
        })

    Thread.sleep(3100L)
    disposable.dispose()
}

fun backPressureStrategy() {
    Flowable.create<Int>({ emitter ->
        for (i in 0..1000) {
            if (emitter.isCancelled) {
                return@create
            }

            emitter.onNext(i)
        }

        emitter.onComplete()
    }, BackpressureStrategy.BUFFER)
        .subscribeOn(Schedulers.computation())
        .observeOn(Schedulers.io())
        .subscribe({
            println(it)
        }, { throwable ->
            println("error : ${throwable.message}")
        })

    Thread.sleep(100L)
}