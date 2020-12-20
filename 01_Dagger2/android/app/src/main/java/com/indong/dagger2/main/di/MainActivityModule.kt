package com.indong.dagger2.main.di

import com.indong.dagger2.ActivityScope
import com.indong.dagger2.FragmentScope
import com.indong.dagger2.main.MainFragment
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import javax.inject.Named

@Module
abstract class MainActivityModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun mainFragment(): MainFragment

    companion object {
        @Named("activity")
        @Provides
        @ActivityScope
        fun provideActivityName(): String {
            return "String from MainActivityModule"
        }
    }

}