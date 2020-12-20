package com.indong.dagger2.main

import android.content.Context
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.DaggerFragment
import javax.inject.Inject
import javax.inject.Named

class MainFragment : DaggerFragment() {
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