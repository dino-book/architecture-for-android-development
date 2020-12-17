package model

import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
annotation class NumberKey(val value: KClass<out Number>)