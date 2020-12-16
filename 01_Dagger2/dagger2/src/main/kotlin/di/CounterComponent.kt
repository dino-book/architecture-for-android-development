package di

import dagger.Component
import model.Counter

@Component(modules = [CounterModule::class])
interface CounterComponent {
    fun inject(counter: Counter)
}