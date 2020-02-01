package di

import com.example.daggerandroidinjection.MainApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [AndroidInjectionModule::class, ViewModule::class])
interface MainComponent : AndroidInjector<MainApplication>