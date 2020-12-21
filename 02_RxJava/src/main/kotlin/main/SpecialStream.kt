package main

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single

fun main() {
    single()
    singleCreate()
    makeSingle()
}

fun single() {
    Single.just("Hello World")
        .subscribe { text: String ->
            println(text)
        }
}

fun singleCreate() {
    Single.create<String> {
        it.onSuccess("Success")
    }.subscribe { text: String ->
        println(text)
    }
}

fun makeSingle() {
    val src = Observable.just(1, 2, 3)

    src.all { it > 1 }.subscribe { bool: Boolean ->
        println(bool)
    }
    src.first(-1).subscribe { number: Int ->
        println(number)
    }
    src.toList().subscribe { list: List<Int> ->
        println(list)
    }
}