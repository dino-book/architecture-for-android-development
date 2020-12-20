package di.module

import dagger.Module
import dagger.Provides
import model.CoffeeBean

@Module
class MachineModule {
    @Provides
    fun provideCoffeeBean(): CoffeeBean {
        return CoffeeBean()
    }
}