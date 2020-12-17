package di.component

import dagger.Component
import di.module.MapKeyModule
import model.Animal

@Component(modules = [MapKeyModule::class])
interface MapKeyComponent {
    fun getStringsByAnimal(): Map<Animal, String>

    fun getStringsByNumber(): Map<Class<out Number>, String>
}