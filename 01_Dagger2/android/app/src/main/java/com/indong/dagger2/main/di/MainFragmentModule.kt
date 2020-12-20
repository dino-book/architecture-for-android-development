package com.indong.dagger2.main.di

import com.indong.dagger2.FragmentScope
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MainFragmentModule {

    @Named("fragment")
    @Provides
    @FragmentScope
    fun provideString(): String {
        return "String from MainFragmentModule"
    }
}