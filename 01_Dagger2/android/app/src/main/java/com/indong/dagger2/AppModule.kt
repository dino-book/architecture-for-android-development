package com.indong.dagger2

import android.content.Context
import android.content.SharedPreferences
import com.indong.dagger2.main.MainActivity
import com.indong.dagger2.main.di.MainActivitySubcomponent
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import javax.inject.Named
import javax.inject.Singleton

@Module(subcomponents = [MainActivitySubcomponent::class])
abstract class AppModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    abstract fun bindAndroidInjectorFactory(factory: MainActivitySubcomponent.Factory): AndroidInjector.Factory<*>

    companion object {
        @Named("app")
        @Provides
        @Singleton
        fun provideString(): String {
            return "String from AppModule"
        }
    }
}