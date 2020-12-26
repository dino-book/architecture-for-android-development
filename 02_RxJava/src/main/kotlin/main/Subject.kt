package main

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.*
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger

fun main() {
    publishSubject()
    subjectForObserver()

    serializedSubject()
    behaviorSubject()
    replaySubject()
    asyncSubject()
    unicastSubject()
}

fun Subject<String>.subscribeSubject(name: String) {
    subscribe({
        println("$name : $it")
    }, { throwable ->
        println("error : ${throwable.message}")
    }, {
        println("$name : onComplete")
    })
}

fun publishSubject() {
    println("== PublishSubject ==")

    val subject = PublishSubject.create<String>()

    subject.subscribeSubject("A")
    subject.subscribeSubject("B")

    subject.onNext("PublishSubject")

    subject.subscribeSubject("C")

    subject.onComplete()

    subject.subscribeSubject("D")
}

fun subjectForObserver() {
    println("== subject for observer ==")

    val subject = PublishSubject.create<String>()

    Observable.interval(1L, TimeUnit.SECONDS).map { "A : $it" }.subscribe(subject)
    Observable.interval(500L, TimeUnit.MILLISECONDS).map { "B : $it" }.subscribe(subject)

    val disposable = subject.subscribe {
        println(it)
    }

    Thread.sleep(3000L)
    disposable.dispose()
}

fun serializedSubject() {
    println("== SerializedSubject ==")
    val counter = AtomicInteger()

    val subject = PublishSubject.create<Int>().toSerialized()
    subject.doOnNext {
        counter.incrementAndGet()
    }.doOnNext {
        counter.decrementAndGet()
    }.filter {
        counter.get() != 0
    }.subscribe({
        println(it)
    }, { throwable ->
        println("error : ${throwable.message}")
    })

    val runnable = {
        for (i in 0 until 1_000) {
            try {
                Thread.sleep(1L)
            } catch (e: Throwable) {
                e.printStackTrace()
            }
            subject.onNext(i)
        }
    }

    Thread(runnable).start()
    Thread(runnable).start()
    Thread.sleep(1000L)
    println("종료")
}

fun behaviorSubject() {
    println("== BehaviorSubject ==")

    val subject = BehaviorSubject.create<String>()

    subject.subscribeSubject("A")

    subject.onNext("1")
    subject.onNext("2")

    subject.subscribeSubject("B")

    subject.onNext("3")

    subject.subscribeSubject("C")

    subject.onComplete()

    subject.subscribeSubject("D")
}

fun replaySubject() {
    println("== ReplaySubject ==")

    val subject = ReplaySubject.create<String>()

    subject.subscribeSubject("A")

    subject.onNext("1")
    subject.onNext("2")

    subject.subscribeSubject("B")

    subject.onNext("3")

    subject.subscribeSubject("C")

    subject.onComplete()

    subject.subscribeSubject("D")
}

fun asyncSubject() {
    println("== AsyncSubject ==")

    val subject = AsyncSubject.create<String>()

    subject.subscribeSubject("A")

    subject.onNext("1")
    subject.onNext("2")

    subject.subscribeSubject("B")

    subject.onNext("3")

    subject.subscribeSubject("C")

    subject.onComplete()

    subject.subscribeSubject("D")
}

fun unicastSubject() {
    println("== UnicastSubject ==")

    val subject = UnicastSubject.create<Long>()

    Observable.interval(1, TimeUnit.SECONDS)
        .subscribe(subject)

    Thread.sleep(3000L)
    subject.subscribe {
        println("A : $it")
    }
    Thread.sleep(2000L)
}