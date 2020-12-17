package di.component

import dagger.Component
import di.module.MapModule

@Component(modules = [MapModule::class])
interface MapComponent {
    fun getLongsByString(): Map<String, Long>

    fun getStringsByClass(): Map<Class<*>, String>
}