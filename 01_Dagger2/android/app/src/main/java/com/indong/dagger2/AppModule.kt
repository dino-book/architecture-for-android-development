package com.indong.dagger2

import android.content.Context
import android.content.SharedPreferences
import com.indong.dagger2.main.di.MainActivityComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [MainActivityComponent::class])
class AppModule {
    @Provides
    @Singleton
    fun provideSharedPreferences(app: App): SharedPreferences {
        return app.getSharedPreferences("default", Context.MODE_PRIVATE)
    }
}