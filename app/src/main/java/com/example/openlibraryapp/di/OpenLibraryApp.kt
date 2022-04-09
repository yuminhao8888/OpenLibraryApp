package com.example.openlibraryapp.di

import android.app.Application

class OpenLibraryApp : Application() {

    override fun onCreate() {
        super.onCreate()

        libraryComponent = DaggerOpenLibraryComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }

    companion object {
        lateinit var libraryComponent: OpenLibraryComponent
    }
}