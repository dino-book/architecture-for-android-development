package di.module

import dagger.Module
import dagger.Provides

@Module
class HelloModule {
    @Provides
    fun provideString(): String {
        return "Hello World"
    }
}