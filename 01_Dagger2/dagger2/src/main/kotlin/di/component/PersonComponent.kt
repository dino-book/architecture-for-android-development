package di.component

import dagger.Component
import di.module.PersonModule
import model.PersonA
import model.PersonB

@Component(modules = [PersonModule::class])
interface PersonComponent {
    fun getPersonA(): PersonA // 프로비전 메서드

    fun inject(personB: PersonB) // 멤버-인젝션 메서드
}