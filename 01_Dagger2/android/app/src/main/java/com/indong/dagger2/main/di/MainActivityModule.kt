package com.indong.dagger2.main.di

import com.indong.dagger2.ActivityScope
import com.indong.dagger2.main.MainFragment
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import javax.inject.Named

@Module(subcomponents = [MainFragmentSubcomponent::class])
abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ClassKey(MainFragment::class)
    abstract fun bindInjectorFactory(factory: MainFragmentSubcomponent.Factory): AndroidInjector.Factory<*>

    companion object {
        @Named("activity")
        @Provides
        @ActivityScope
        fun provideActivityName(): String {
            return "String from MainActivityModule"
        }
    }

}