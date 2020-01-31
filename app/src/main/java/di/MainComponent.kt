package di

import com.example.daggerandroidinjection.MainApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import di.activity.MainActivityModule

@Component(modules = [AndroidInjectionModule::class, MainActivityModule::class])
interface MainComponent : AndroidInjector<MainApplication>