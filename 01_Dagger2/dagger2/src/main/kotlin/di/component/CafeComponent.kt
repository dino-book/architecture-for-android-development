package di.component

import dagger.Component
import di.module.CafeModule
import model.Cafe

@Component(modules = [CafeModule::class])
interface CafeComponent {
    fun inject(cafe: Cafe)
}