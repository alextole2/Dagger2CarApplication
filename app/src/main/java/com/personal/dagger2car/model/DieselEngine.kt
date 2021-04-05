package com.personal.dagger2car.model

import android.util.Log

class DieselEngine(private val horsePower: Int) : Engine {
    override fun start() {
        Log.d(TAG, "Diesel engine started: $horsePower hp")
    }
}