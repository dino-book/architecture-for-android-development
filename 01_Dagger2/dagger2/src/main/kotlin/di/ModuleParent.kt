package di

import dagger.Module
import dagger.Provides

@Module
class ModuleParent {
    @Provides
    fun provideA() : String {
        return "A"
    }
}