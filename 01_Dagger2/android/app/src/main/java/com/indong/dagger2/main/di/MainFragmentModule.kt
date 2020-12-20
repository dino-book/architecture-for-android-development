package com.indong.dagger2.main.di

import com.indong.dagger2.FragmentScope
import dagger.Module
import dagger.Provides
import kotlin.random.Random

@Module
class MainFragmentModule {
    @Provides
    @FragmentScope
    fun provideInt(): Int {
        return Random.nextInt()
    }
}