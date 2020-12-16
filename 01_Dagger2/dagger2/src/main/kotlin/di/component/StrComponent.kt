package di.component

import dagger.Component
import di.module.CommonModule
import di.module.HelloModule
import model.Foo

@Component(modules = [CommonModule::class, HelloModule::class])
interface StrComponent {
    fun inject(foo: Foo)
}