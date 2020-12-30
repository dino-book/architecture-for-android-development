package com.indong.sampleapp.di.component

import com.indong.sampleapp.App
import com.indong.sampleapp.di.module.ActivityModule
import com.indong.sampleapp.di.module.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ActivityModule::class, AppModule::class])
interface AppComponent : AndroidInjector<App> {

    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<App>
}