package com.personal.dagger2car.di

import com.personal.dagger2car.model.Rims
import com.personal.dagger2car.model.Tires
import com.personal.dagger2car.model.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Provides
    fun provideRims() = Rims()

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflateTires()
        return tires
    }

    @Provides
    fun providesWheels(rims: Rims, tires: Tires) = Wheels(rims, tires)
}