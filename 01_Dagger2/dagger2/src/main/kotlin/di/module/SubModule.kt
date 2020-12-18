package di.module

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class SubModule {
    @Provides
    @IntoSet
    fun string3(): String {
        return "child string 1"
    }

    @Provides
    @IntoSet
    fun string4(): String {
        return "child string 2"
    }
}