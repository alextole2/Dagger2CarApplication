package com.personal.dagger2car

import android.app.Application
import com.personal.dagger2car.di.ApplicationComponent
import com.personal.dagger2car.di.DaggerApplicationComponent
import com.personal.dagger2car.di.DriverModule

class Dagger2CarApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        val driveModule = DriverModule("John")
        applicationComponent = DaggerApplicationComponent.factory().create(driveModule)
    }
}