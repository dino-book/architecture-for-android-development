package di.component

import dagger.Component
import di.module.CommonModule
import model.Foo

@Component(modules = [CommonModule::class])
interface NoStrComponent {
    fun inject(foo: Foo)
}