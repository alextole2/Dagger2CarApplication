package com.personal.dagger2car.model

import android.util.Log
import com.personal.dagger2car.di.PerActivityScope
import javax.inject.Inject

val TAG = Car::class.simpleName

@PerActivityScope
class Car @Inject constructor(
    val wheels: Wheels,
    private val engine: Engine,
    private val driver: Driver
) {

    fun drive() {
        engine.start()
        Log.d(TAG, "${driver.name} is driving $this")
    }

    @Inject
    fun connectRemote(remote: Remote) {
        remote.enableRemote(this)
    }
}