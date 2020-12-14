package di

import dagger.Component

@Component(modules = [MyModule::class])
interface MyComponent {
    fun getString(): String // Provision Method. 바인드된 모듈로부터 의존성을 제공.

    fun getDouble(): Double?
}