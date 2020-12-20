package model

import javax.inject.Inject

data class Coffee @Inject constructor(val coffeeBean: CoffeeBean, val water: Water)