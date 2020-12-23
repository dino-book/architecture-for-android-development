package main

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    defer()

    empty()
    never()

    interval()
    range()
    timer()
}

fun defer() {
    println("== defer ==")

    val justSrc = Observable.just(System.currentTimeMillis())
    val deferSrc = Observable.defer {
        Observable.just(System.currentTimeMillis())
    }

    println("#1 now - ${System.currentTimeMillis()}")
    Thread.sleep(3000L)
    println("#2 now - ${System.currentTimeMillis()}")

    justSrc.subscribe {
        println("#1 just time - $it")
    }
    deferSrc.subscribe {
        println("#2 defer time - $it")
    }
}

fun empty() {
    println("== empty ==")

    Observable.empty<Nothing>()
        .doOnTerminate {
            println("empty 종료")
        }.subscribe()
}

fun never() {
    println("== never ==")

    Observable.never<Nothing>()
        .doOnTerminate {
            println("empty 종료")
        }.subscribe()
}

fun interval() {
    println("== interval ==")

    val disposable = Observable.interval(1L, TimeUnit.SECONDS)
        .subscribe {
            println("interval time : $it")
        }

    Thread.sleep(5000L)

    disposable.dispose()
}

fun range() {
    println("== range ==")

    Observable.range(1, 3)
        .subscribe {
            println(it)
        }
}

fun timer() {
    println("== timer ==")

    val src = Observable.timer(1L, TimeUnit.SECONDS)
    println("timer 구독")
    src.subscribe { println("timer 실행!") }
    Thread.sleep(1001L)
}