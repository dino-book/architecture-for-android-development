package model

import di.component.MachineComponent
import di.module.MachineModule

class Machine(builder: MachineComponent.Builder) {
    val component: MachineComponent = builder.setMachineModule(MachineModule()).build()

    init {
        component.inject(this)
    }

    fun extract(): Coffee {
        return component.getCoffee()
    }
}