package com.indong.dagger2.main.di

import com.indong.dagger2.ActivityScope
import com.indong.dagger2.main.MainActivity
import dagger.Module
import dagger.Provides

@Module(subcomponents = [MainFragmentComponent::class])
class MainActivityModule {
    @Provides
    @ActivityScope
    fun provideActivityName(): String? {
        return MainActivity::class.java.simpleName
    }
}