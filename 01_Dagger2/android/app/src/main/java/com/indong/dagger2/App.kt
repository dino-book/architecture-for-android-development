package com.indong.dagger2

import android.app.Application

class App : Application() {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(this, AppModule())
    }

    fun getAppComponent(): AppComponent {
        return appComponent
    }
}