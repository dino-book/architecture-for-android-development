package di.component

import dagger.Component
import di.module.MultiBindsModule

@Component(modules = [MultiBindsModule::class])
interface MultiBindsComponent {
    fun getStrings(): Set<String>
}