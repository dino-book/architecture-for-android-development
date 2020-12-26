package main

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    doOnEach()
    doOnNext()
    doOnSubscribe()
    doOnComplete()
    doOnError()
    doOnTerminate()
    doOnDispose()
    doFinally()
}

fun doOnEach() {
    println("== doOnEach ==")

    Observable.just(1, 2, 3)
        .doOnEach { notification ->
            val number = notification.value

            val isOnNext = notification.isOnNext
            val isOnComplete = notification.isOnComplete
            val isOnError = notification.isOnError

            val throwable = notification.error

            println("number: $number")
            println("isOnNext: $isOnNext")
            println("isOnComplete: $isOnComplete")
            println("isOnError: $isOnError")

            throwable?.printStackTrace()
        }.subscribe {
            println("subscribed: $it")
            println()
        }
}

fun doOnNext() {
    println("== doOnNext ==")

    Observable.just(1, 2, 3)
        .doOnNext { number ->
            println("number in doOnNext : $number")
        }.subscribe {
            println("number in subscribe : $it")
        }
}

fun doOnSubscribe() {
    println("== doOnSubscribe ==")

    Observable.just(1, 2, 3)
        .doOnSubscribe {
            println("구독 시작!")
        }.subscribe {
            println(it)
        }
}

fun doOnComplete() {
    println("== doOnComplete ==")

    Observable.just(1, 2, 3)
        .doOnSubscribe {
            println("완료!")
        }.subscribe {
            println(it)
        }
}

fun doOnError() {
    println("== doOnError ==")

    Observable.just(2, 1, 0)
        .map { number ->
            10 / number
        }.doOnError {
            println("오류 발생!")
        }.subscribe({
            println(it)
        }, {
            println("error : ${it.message}")
        })
}

fun doOnTerminate() {
    println("== doOnTerminate ==")

    Observable.just(2, 1, 0)
        .map { number ->
            10 / number
        }.doOnComplete {
            println("doOnComplete")
        }.doOnTerminate {
            println("doOnTerminate")
        }.subscribe({
            println(it)
        }, {
            println("error : ${it.message}")
        })
}

fun doOnDispose() {
    println("== doOnDispose ==")

    val disposable = Observable.interval(500L, TimeUnit.MILLISECONDS)
        .doOnDispose {
            println("doOnDispose")
        }.subscribe {
            println(it)
        }

    Thread.sleep(1100L)
    disposable.dispose()
}

fun doFinally() {
    println("== doFinally ==")

    val disposable = Observable.interval(500L, TimeUnit.MILLISECONDS)
        .doOnComplete {
            println("doOnComplete")
        }.doOnTerminate {
            println("doOnTerminate")
        }.doOnDispose {
            println("doOnDispose")
        }.doFinally {
            println("doFinally")
        }.subscribe {
            println(it)
        }

    Thread.sleep(1100L)
    disposable.dispose()
}