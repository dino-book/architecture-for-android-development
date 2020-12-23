package main

import io.reactivex.rxjava3.core.Observable

fun main() {
    map()
    flatMap()

    buffer()

    scan()

    groupBy()
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