package com.indong.dagger2.main

import android.content.Context
import android.content.SharedPreferences
import androidx.fragment.app.Fragment
import com.indong.dagger2.main.di.MainFragmentModule
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject
import javax.inject.Named

class MainFragment : Fragment() {
    @Inject
    @Named("app")
    lateinit var appString: String

    @Inject
    @Named("activity")
    lateinit var activityString: String

    @Inject
    @Named("fragment")
    lateinit var fragmentString: String

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}