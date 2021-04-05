package com.personal.dagger2car.di

import com.personal.dagger2car.model.Engine
import com.personal.dagger2car.model.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}