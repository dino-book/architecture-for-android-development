package main

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.functions.BiFunction
import java.util.concurrent.TimeUnit

fun main() {
    combineLatest()
    zip()
    merge()
}

fun combineLatest() {
    println("== combineLatest ==")

    val src1 = Observable.create<Int> {
        Thread {
            for (i in 1..5) {
                it.onNext(i)
                try {
                    Thread.sleep(200L)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }.start()
    }

    val src2 = Observable.create<String> {
        Thread {
            try {
                Thread.sleep(100L)
                it.onNext("A")
                Thread.sleep(140L)
                it.onNext("B")
                Thread.sleep(20L)
                it.onNext("C")
                Thread.sleep(140L)
                it.onNext("D")
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }.start()
    }

    Observable.combineLatest(src1, src2, BiFunction { t1: Int, t2: String ->
        "$t1$t2"
    }).subscribe {
        println(it)
    }

    Thread.sleep(1000L)
}

fun zip() {
    println("== zip ==")

    val src1 = Observable.create<Int> {
        Thread {
            for (i in 1..5) {
                it.onNext(i)
                try {
                    Thread.sleep(200L)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }.start()
    }

    val src2 = Observable.create<String> {
        Thread {
            try {
                Thread.sleep(100L)
                it.onNext("A")
                Thread.sleep(140L)
                it.onNext("B")
                Thread.sleep(20L)
                it.onNext("C")
                Thread.sleep(140L)
                it.onNext("D")
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }.start()
    }

    Observable.zip(src1, src2, BiFunction { t1: Int, t2: String ->
        "$t1$t2"
    }).subscribe {
        println(it)
    }

    Thread.sleep(1000L)
}

fun merge() {
    println("== merge ==")

    val src1 = Observable.intervalRange(1, 5, 0, 100L, TimeUnit.MILLISECONDS)
        .map {
            it * 20
        }
    val src2 = Observable.create<Int> {
        Thread {
            try {
                Thread.sleep(350L)
                it.onNext(1)
                Thread.sleep(200L)
                it.onNext(1)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }.start()
    }

    Observable.merge(src1, src2)
        .subscribe {
            println(it)
        }

    Thread.sleep(1000L)
}