package com.indong.sampleapp.di.module

import android.app.Application
import android.content.Context
import com.indong.sampleapp.App
import com.indong.sampleapp.common.SingleLiveEvent
import com.indong.sampleapp.di.annotation.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideApp(app: App): Application {
        return app
    }

    @Provides
    @Singleton
    @ApplicationContext
    fun provideContext(app: App): Context {
        return app
    }

    @Singleton
    @Provides
    @Named("errorEvent")
    fun provideErrorEvent(): SingleLiveEvent<Throwable> {
        return SingleLiveEvent()
    }
}