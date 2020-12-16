package di.module

import dagger.BindsOptionalOf
import dagger.Module

@Module
abstract class CommonModule {
    @BindsOptionalOf
    abstract fun bindsOptionalOfString(): String
}