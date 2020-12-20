package di.component

import dagger.Subcomponent
import model.Machine
import di.module.MachineModule
import model.Coffee

@Subcomponent(modules = [MachineModule::class])
interface MachineComponent {
    fun getCoffee(): Coffee

    fun inject(machine: Machine)

    @Subcomponent.Builder
    interface Builder {
        fun setMachineModule(coffeeMachineModule: MachineModule): Builder

        fun build(): MachineComponent
    }
}