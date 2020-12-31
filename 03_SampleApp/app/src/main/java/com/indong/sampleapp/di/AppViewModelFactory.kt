package com.indong.sampleapp.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
class AppViewModelFactory @Inject constructor(
    private val creators: HashMap<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val creator: Provider<ViewModel> = creators[modelClass] ?: creators.entries.find { entry ->
            modelClass.isAssignableFrom(entry.key)
        }?.value
        ?: throw IllegalArgumentException("Unknown model class $modelClass")

        try {
            return creator.get() as T
        } catch (e: Exception) {
            throw RuntimeException()
        }

    }
}