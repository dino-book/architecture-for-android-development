package model

import javax.inject.Inject

class PersonB {
    // 필드 주입
    @Inject
    lateinit var name: String

    // 메서드 주입
    var birthday: Int? = null
        @Inject
        set
}