package di.module

import dagger.Module
import dagger.multibindings.Multibinds

@Module
abstract class MultiBindsModule {
    @Multibinds
    abstract fun strings(): Set<String>
}