package com.personal.dagger2car.model

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horsePower") private val horsePower: Int,
    @Named("engineCapacity") private val engineCapacity: Int
) : Engine {
    override fun start() {
        Log.d(TAG, "Petrol engine started: $horsePower hp, $engineCapacity capacity")
    }
}