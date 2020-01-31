package di

import com.example.daggerandroidinjection.MainApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = arrayOf(AndroidInjectionModule::class, MainActivityModule::class))
interface MainComponent : AndroidInjector<MainApplication>