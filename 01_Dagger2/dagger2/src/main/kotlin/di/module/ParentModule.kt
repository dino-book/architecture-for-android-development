package di.module

import dagger.Module
import dagger.Provides

@Module
class ParentModule {
    @Provides
    fun provideA() : String {
        return "A"
    }
}