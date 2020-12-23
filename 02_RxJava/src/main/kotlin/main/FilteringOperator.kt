package main

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    debounce()
    distinct()

    elementAt()

    filter()

    sample()

    skip()
    take()

    all()

    amb()
}

fun debounce() {
    println("== debounce ==")

    Observable.create<Int> {
        it.onNext(1)
        Thread.sleep(100L)
        it.onNext(2)
        it.onNext(3)
        it.onNext(4)
        Thread.sleep(100L)
        it.onNext(5)
    }.debounce(10, TimeUnit.MILLISECONDS)
        .subscribe { println(it) }
}

fun distinct() {
    println("== distinct ==")

    Observable.just(1, 2, 2, 1, 3)
        .distinct()
        .subscribe {
            println(it)
        }
}

fun elementAt() {
    println("== elementAt ==")

    Observable.just(1, 2, 3, 4)
        .elementAt(2)
        .subscribe {
            println(it)
        }
}

fun filter() {
    println("== filter ==")

    Observable.just(2, 30, 22, 5, 60, 1)
        .filter { number ->
            number > 10
        }.subscribe {
            println(it)
        }
}

fun sample() {
    println("== sample ==")

    val disposable = Observable.interval(100L, TimeUnit.MILLISECONDS)
        .sample(300L, TimeUnit.MILLISECONDS)
        .subscribe {
            println(it)
        }

    Thread.sleep(1000L)

    disposable.dispose()
}

fun skip() {
    println("== skip ==")

    Observable.just(1, 2, 3, 4)
        .skip(2)
        .subscribe {
            println(it)
        }
}

fun take() {
    println("== take ==")
    Observable.just(1, 2, 3, 4)
        .take(2)
        .subscribe {
            println(it)
        }
}

fun all() {
    println("== all ==")

    Observable.just(2, 1)
        .all { number ->
            number > 0
        }.subscribe { bool: Boolean ->
            println(bool)
        }
}

fun amb() {
    println("== amb ==")

    val list = listOf(
        Observable.just(20, 40, 60).delay(100L, TimeUnit.MILLISECONDS),
        Observable.just(1, 2, 3),
        Observable.just(0, 0, 0).delay(200L, TimeUnit.MILLISECONDS)
    )

    Observable.amb(list)
        .subscribe {
            println(it)
        }
}