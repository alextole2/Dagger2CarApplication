package com.personal.dagger2car.di

import com.personal.dagger2car.model.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule(private val name: String) {
    @Provides
    @Singleton
    fun driver(): Driver = Driver(name)
}