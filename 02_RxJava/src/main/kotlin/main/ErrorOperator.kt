package main

import io.reactivex.rxjava3.core.Observable

fun main() {
    onError()
    onErrorReturn()
    onErrorResumeNext()
    retry()
}

fun onError() {
    println("== onError ==")

    Observable.just("1", "2", "a", "3")
        .map { stringNum ->
            stringNum.toInt()
        }.subscribe({
            println(it)
        }, {
            println("error!")
        })
}

fun onErrorReturn() {
    println("== onErrorReturn ==")

    Observable.just("1", "2", "a", "3")
        .map { stringNum ->
            stringNum.toInt()
        }.onErrorReturn {
            -1
        }.subscribe {
            println(it)
        }
}

fun onErrorResumeNext() {
    println("== onErrorResumeNext ==")

    Observable.just("1", "2", "a", "3")
        .map { stringNum ->
            stringNum.toInt()
        }.onErrorResumeNext {
            Observable.just(100, 200, 300)
        }.subscribe {
            println(it)
        }
}

fun retry() {
    println("== retry ==")

    Observable.just("1", "2", "a", "3")
        .map { stringNum ->
            stringNum.toInt()
        }.retry(2)
        .subscribe({
            println(it)
        },{
            println("error!")
        })
}