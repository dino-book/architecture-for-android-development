package di.module

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet
import di.component.SubComponent

@Module(subcomponents = [SubComponent::class])
class SuperModule {
    @Provides
    @IntoSet
    fun string1(): String {
        return "parent string 1"
    }

    @Provides
    @IntoSet
    fun string2(): String {
        return "parent string 2"
    }
}
