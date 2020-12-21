package main

import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single

fun main() {
    single()
    singleCreate()
    makeSingle()

    maybe()

    completable()
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

fun maybe() {
    Maybe.create<Int> {
        it.onSuccess(100)
        it.onComplete()
    }.doOnSuccess {
        println("maybe - doOnSuccess")
    }.doOnComplete {
        println("maybe - doOnComplete")
    }.subscribe {
        println(it)
    }

    Maybe.create<Int> {
        it.onComplete()
        it.onSuccess(100)
    }.doOnSuccess {
        println("maybe - doOnSuccess2")
    }.doOnComplete {
        println("maybe - doOnComplete2")
    }.subscribe {
        println(it)
    }
}

fun completable() {
    Completable.create {
        it.onComplete()
    }.subscribe {
        println("Completed")
    }
}