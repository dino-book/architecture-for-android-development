package di.module

import dagger.Module
import dagger.Provides

@Module
class CounterModule {
    var next = 100
    var nextDouble = 100.0

    @Provides
    fun provideInteger(): Int {
        println("computing...")
        return next++
    }

    @Provides
    fun provideDouble(): Double {
        println("computing...")
        return nextDouble++
    }
}