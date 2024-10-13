package com.juaracoding.ujian1batch4androidkotlin.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Article (
    val imageResourceId: Int,
    val title: String,
    val overview: String,
    val description: String
) : Parcelable;