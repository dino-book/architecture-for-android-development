package model

import javax.inject.Inject

class SetFoo {
    @Inject
    lateinit var strings: Set<String>
}