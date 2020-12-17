package di.module

import dagger.Module
import dagger.Provides
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import model.MapFoo

@Module
class MapModule {
    @Provides
    @IntoMap
    @StringKey("foo")
    fun provideFooValue(): Long {
        return 100L
    }

    @Provides
    @IntoMap
    @ClassKey(MapFoo::class)
    fun provideFoStr(): String {
        return "Foo String"
    }
}