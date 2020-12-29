package com.indong.sampleapp.model.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Post(
    val userId: Long,
    val id: Long,
    val title: String,
    val body: String
): Parcelable