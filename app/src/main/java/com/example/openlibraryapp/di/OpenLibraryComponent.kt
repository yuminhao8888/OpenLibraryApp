package com.example.openlibraryapp.di

import com.example.openlibraryapp.MainActivity
import com.example.openlibraryapp.views.BaseFragment
import dagger.Component

@Component(
    modules = [
        NetworkModule::class,
        ApplicationModule::class

    ]
)
interface OpenLibraryComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(baseFragment: BaseFragment)
    //fun inject(starShipsFragment: StarShipsFragment)
    //fun inject(planetsFragment: PlanetsFragment)
}