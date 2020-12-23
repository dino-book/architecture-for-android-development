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

    map()
    flatMap()
    buffer()
    scan()
    groupBy()
}

fun defer() {
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
    Observable.empty<Nothing>()
        .doOnTerminate {
            println("empty 종료")
        }.subscribe()
}

fun never() {
    Observable.never<Nothing>()
        .doOnTerminate {
            println("empty 종료")
        }.subscribe()
}

fun interval() {
    val disposable = Observable.interval(1L, TimeUnit.SECONDS)
        .subscribe {
            println("interval time : $it")
        }

    Thread.sleep(5000L)

    disposable.dispose()
}

fun range() {
    Observable.range(1, 3)
        .subscribe {
            println(it)
        }
}

fun timer() {
    val src = Observable.timer(1L, TimeUnit.SECONDS)
    println("timer 구독")
    src.subscribe { println("timer 실행!") }
    Thread.sleep(1001L)
}

fun map() {
    Observable.just(1, 2, 3)
        .map {
            it * 10
        }.subscribe {
            println(it)
        }
}

fun flatMap() {
    Observable.just("a", "b", "c")
        .flatMap {
            Observable.just("${it}1", "${it}2")
        }.subscribe {
            println(it)
        }
}

fun buffer() {
    Observable.range(0, 10)
        .buffer(3)
        .subscribe { numbers ->
            println("버퍼 데이터 발행")
            numbers.forEach {
                println("#$it")
            }
        }
}

fun scan() {
    Observable.range(1, 5)
        .scan { t1: Int, t2: Int ->
            println("$t1 + $t2 = ${t1 + t2}")
            t1 + t2
        }.subscribe()
}

fun groupBy() {
    fun classify(item: String): String {
        return when(item.split(" ")[1]) {
            "Circle" -> "C"
            "Triangle" -> "T"
            else -> "None"
        }
    }
    Observable.just(
        "Magenta Circle",
        "Cyan Circle",
        "Yellow Triangle",
        "Yellow Circle",
        "Magenta Triangle",
        "Cyan Triangle"
    ).groupBy { item ->
        classify(item)
    }.subscribe { group ->
        println("${group.key} 그룹 발행 시작")
        group.subscribe {
            println("${group.key} : $it")
        }
    }
}