package com.indong.dagger2

import dagger.Module
import dagger.Provides

@Module
class MyModule {
    @Provides
    fun provideHelloWorld(): String {
        return "Hello World"
    }
}