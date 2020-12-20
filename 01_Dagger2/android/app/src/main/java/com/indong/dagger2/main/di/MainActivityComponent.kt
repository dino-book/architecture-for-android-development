package com.indong.dagger2.main.di

import com.indong.dagger2.ActivityScope
import com.indong.dagger2.main.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [MainActivityModule::class])
@ActivityScope
interface MainActivityComponent {
    fun mainFragmentComponentBuilder(): MainFragmentComponent.Builder

    fun inject(activity: MainActivity)

    @Subcomponent.Builder
    interface Builder  {
        fun setModule(module: MainActivityModule): Builder

        @BindsInstance
        fun setActivity(activity: MainActivity): Builder

        fun build(): MainActivityComponent
    }
}