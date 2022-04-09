package com.example.openlibraryapp.di

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule (
    private val applicationContext: Context
) {

    @Provides
    fun providesApplicationContext() = applicationContext



}