package di.component

import dagger.Component
import di.module.SuperModule

@Component(modules = [SuperModule::class])
interface SuperComponent {
    fun strings(): Set<String>

    fun subComponentBuilder(): SubComponent.Builder
}