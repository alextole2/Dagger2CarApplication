package com.personal.dagger2car.di

import com.personal.dagger2car.model.DieselEngine
import com.personal.dagger2car.model.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {
    @Provides
    fun provideEngine(): Engine = DieselEngine(horsePower)
}