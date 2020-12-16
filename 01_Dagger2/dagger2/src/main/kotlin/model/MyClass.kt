package model

import javax.inject.Inject
import javax.inject.Named

class MyClass {
    @Inject
    lateinit var string: String

    @Inject
    @Named("HelloWorld")
    lateinit var helloWorld: String
}