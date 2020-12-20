package di.module

import dagger.Module
import dagger.Provides
import model.Machine
import di.component.MachineComponent
import model.Water

@Module(subcomponents = [MachineComponent::class])
class CafeModule {
    @Provides
    fun provideWater(): Water {
        return Water()
    }

    @Provides
    fun provideMachine(builder: MachineComponent.Builder): Machine {
        return Machine(builder)
    }
}