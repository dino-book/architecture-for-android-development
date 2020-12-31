package com.indong.sampleapp.di.module

import androidx.lifecycle.ViewModelProvider
import com.indong.sampleapp.di.AppViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: AppViewModelFactory): ViewModelProvider.Factory
}