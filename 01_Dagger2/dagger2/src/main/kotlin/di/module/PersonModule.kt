package di.module

import dagger.Module
import dagger.Provides

@Module
class PersonModule {
    @Provides
    fun provideName(): String {
        return "Austen"
    }

    @Provides
    fun provideBirthday(): Int? {
        return 1991
    }
}