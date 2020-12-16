package di.component

import dagger.Component
import di.module.SingletonModule
import javax.inject.Singleton

@Singleton
@Component(modules = [SingletonModule::class])
interface SingletonComponent {
    fun getAny(): Any
}