package di.component

import dagger.Component
import di.module.CounterModule
import model.Counter

@Component(modules = [CounterModule::class])
interface CounterComponent {
    fun inject(counter: Counter)
}