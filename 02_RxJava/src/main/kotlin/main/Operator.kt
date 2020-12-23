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

fun map() {
    println("== map ==")

    Observable.just(1, 2, 3)
        .map {
            it * 10
        }.subscribe {
            println(it)
        }
}

fun flatMap() {
    println("== flatMap ==")

    Observable.just("a", "b", "c")
        .flatMap {
            Observable.just("${it}1", "${it}2")
        }.subscribe {
            println(it)
        }
}

fun buffer() {
    println("== buffer ==")

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
    println("== scan ==")

    Observable.range(1, 5)
        .scan { t1: Int, t2: Int ->
            println("$t1 + $t2 = ${t1 + t2}")
            t1 + t2
        }.subscribe()
}

fun groupBy() {
    println("== groupBy ==")

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