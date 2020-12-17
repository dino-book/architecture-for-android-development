package di.component

import dagger.Component
import di.module.SetModule
import model.SetFoo

@Component(modules = [SetModule::class])
interface SetComponent {
    fun inject(foo: SetFoo)
}