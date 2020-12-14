package model

import javax.inject.Inject

// 생성자 주입
class PersonA @Inject constructor(val name: String, val birthday: Int?) {
}