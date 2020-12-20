package com.indong.dagger2

import com.indong.dagger2.main.MainActivity
import com.indong.dagger2.main.di.MainActivityModule
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import javax.inject.Named
import javax.inject.Singleton

@Module
abstract class AppModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivity(): MainActivity

    companion object {
        @Named("app")
        @Provides
        @Singleton
        fun provideString(): String {
            return "String from AppModule"
        }
    }
}