package com.indong.dagger2.main

import android.content.Context
import android.content.SharedPreferences
import androidx.fragment.app.Fragment
import com.indong.dagger2.main.di.MainFragmentModule
import javax.inject.Inject

class MainFragment : Fragment() {
    @Inject
    lateinit var sharedPreferences: SharedPreferences

    @Inject
    @JvmField
    var activityName: String? = null

    @Inject
    @JvmField
    var randomNumber: Int = 0

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (activity as? MainActivity ?: return).getMainActivityComponent()
            .mainFragmentComponentBuilder()
            .setModule(MainFragmentModule())
            .setFragment(this)
            .build()
            .inject(this)
    }
}