package com.personal.dagger2car

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.personal.dagger2car.model.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dagger2CarApplication = (applicationContext as Dagger2CarApplication)
        dagger2CarApplication.applicationComponent
            .getCarComponentFactory()
            .create(120, 1400)
            .inject(this)
        car1.drive()
        car2.drive()
    }
}