package com.personal.dagger2car.model

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {
    fun enableRemote(car: Car) {
        Log.d(TAG, "Remote $car is connected")
    }
}