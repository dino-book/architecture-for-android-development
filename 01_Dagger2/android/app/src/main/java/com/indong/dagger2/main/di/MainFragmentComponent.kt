package com.indong.dagger2.main.di

import com.indong.dagger2.FragmentScope
import com.indong.dagger2.main.MainFragment
import dagger.BindsInstance
import dagger.Subcomponent

@FragmentScope
@Subcomponent(modules = [MainFragmentModule::class])
interface MainFragmentComponent {
    fun inject(fragment: MainFragment)

    @Subcomponent.Builder
    interface Builder {
        fun setModule(module: MainFragmentModule): Builder

        @BindsInstance
        fun setFragment(fragment: MainFragment): Builder

        fun build(): MainFragmentComponent
    }
}