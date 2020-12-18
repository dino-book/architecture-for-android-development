package di.component

import dagger.Subcomponent
import di.module.SubModule

@Subcomponent(modules = [SubModule::class])
interface SubComponent {
    fun strings(): Set<String>

    @Subcomponent.Builder
    interface Builder {
        fun build(): SubComponent
    }
}