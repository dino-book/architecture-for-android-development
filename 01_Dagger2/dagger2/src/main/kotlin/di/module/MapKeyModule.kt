package di.module

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import model.Animal
import model.AnimalKey
import model.NumberKey

@Module
class MapKeyModule {
    @IntoMap
    @AnimalKey(Animal.CAT)
    @Provides
    fun provideCat(): String {
        return "MEOW"
    }

    @IntoMap
    @AnimalKey(Animal.DOG)
    @Provides
    fun provideDog(): String {
        return "BOW-WOW"
    }

    @IntoMap
    @NumberKey(Float::class)
    @Provides
    fun provideFloatValue(): String {
        return "100f"
    }

    @IntoMap
    @NumberKey(Int::class)
    @Provides
    fun provideIntValue(): String {
        return "1"
    }
}