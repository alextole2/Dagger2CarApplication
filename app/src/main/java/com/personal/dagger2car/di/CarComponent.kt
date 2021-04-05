package com.personal.dagger2car.di

import com.personal.dagger2car.MainActivity
import com.personal.dagger2car.model.Car
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@PerActivityScope
/*@Component(
    dependencies = [ApplicationComponent::class],
    modules = [WheelsModule::class, PetrolEngineModule::class]
)*/
@Subcomponent(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)

/*    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("horsePower") hp: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") cap: Int): Builder

        fun getApplicationComponent(applicationComponent: ApplicationComponent): Builder

        fun build(): CarComponent
    }*/

/*    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("horsePower") hp: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") cap: Int): Builder

        fun build(): CarComponent
    }*/

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @Named("horsePower") hp: Int,
            @BindsInstance @Named("engineCapacity") cap: Int
        ): CarComponent
    }
}