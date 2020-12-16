package model

import dagger.Lazy
import javax.inject.Inject
import javax.inject.Provider

class Counter {
    @Inject
    lateinit var lazy: Lazy<Int>

    @Inject
    lateinit var provider: Provider<Double>

    fun printLazy() {
        println("printing...")
        println(lazy.get())
        println(lazy.get())
        println(lazy.get())
    }

    fun printProvider() {
        println("printing...")
        println(provider.get())
        println(provider.get())
        println(provider.get())
    }
}