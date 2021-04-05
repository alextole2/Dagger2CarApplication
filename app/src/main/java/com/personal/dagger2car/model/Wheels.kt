package com.personal.dagger2car.model

import javax.inject.Inject

class Wheels @Inject constructor(val rims: Rims, val tires: Tires) {
}