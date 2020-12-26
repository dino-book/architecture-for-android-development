package main

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit

fun main() {
    defaultScheduler()
    subscribeOn()
    observeOn()
    subscribeOnAndObserveOn()
    operatorsCannotSetSchedulers()
}

fun createObservable(): Observable<Int> {
    return Observable.create<Int> {
        for (i in 0..2) {
            val threadName = Thread.currentThread().name
            println("#Subs on $threadName : $i")
            it.onNext(i)
            Thread.sleep(100)
        }

        it.onComplete()
    }
}

fun Observable<out Number>.subscribeNew(): Disposable {
    return subscribe {
        val threadName = Thread.currentThread().name
        println("#Obsv on $threadName : $it")
    }
}

fun defaultScheduler() {
    println("== default scheduler ==")

    createObservable().subscribeNew()
}

fun subscribeOn() {
    println("== subscribeOn ==")

    createObservable()
        .subscribeOn(Schedulers.io())
        .subscribeNew()

    Thread.sleep(500L)
}

fun observeOn() {
    println("== observeOn ==")

    createObservable()
        .observeOn(Schedulers.io())
        .subscribeNew()

    Thread.sleep(500L)
}

fun subscribeOnAndObserveOn() {
    println("== subscribeOn and observeOn ==")

    createObservable()
        .observeOn(Schedulers.computation())
        .subscribeOn(Schedulers.io())
        .subscribeNew()

    Thread.sleep(500L)
}

fun operatorsCannotSetSchedulers() {
    println("== operators that can not set schedulers ==")

    val disposable = Observable.interval(200L, TimeUnit.MILLISECONDS)
        .subscribeOn(Schedulers.io())
        .subscribeNew()

    Thread.sleep(1000L)
    disposable.dispose()
}