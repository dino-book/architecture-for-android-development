package main

import io.reactivex.rxjava3.core.Observable
import org.reactivestreams.Publisher
import java.util.concurrent.Executors
import java.util.concurrent.Future

fun main() {
    create()
    just()
    fromArray()
    fromIterable()
    fromFuture()
    fromPublisher()
    fromCallable()
}

fun create() {
    val source: Observable<String> = Observable.create {
        it.onNext("- create")
        it.onNext("Hello")
        it.onNext("World")
        it.onComplete()
    }

    source.subscribe { println(it) }
}

fun just() {
    Observable.just("- just", "Hello", "World")
        .subscribe { println(it) }
}

fun fromArray() {
    val itemArray = arrayOf("A", "B", "C")
    Observable.fromArray(*itemArray)
        .subscribe { println(it) }
}

fun fromIterable() {
    val itemList = listOf("AA", "BB", "CC")
    Observable.fromIterable(itemList)
        .subscribe { println(it) }
}

fun fromFuture() {
    val lambda: () -> String = {
        Thread.sleep(3000L)
        "From Future"
    }
    val future: Future<String> = Executors.newSingleThreadExecutor()
        .submit(lambda)

    Observable.fromFuture(future)
        .subscribe { println(it) }
}

fun fromPublisher() {
    val publisher = Publisher<String> {
        it.onNext("From")
        it.onNext("Publisher")
        it.onComplete()
    }

    Observable.fromPublisher(publisher)
        .subscribe { println(it) }
}

fun fromCallable() {
    val callable = {
        "From Callable"
    }

    Observable.fromCallable(callable)
        .subscribe { println(it) }
}