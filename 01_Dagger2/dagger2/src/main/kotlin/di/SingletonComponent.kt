package di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [SingletonModule::class])
interface SingletonComponent {
    fun getAny(): Any
}