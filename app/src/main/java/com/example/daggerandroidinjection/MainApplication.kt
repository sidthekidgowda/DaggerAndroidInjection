package com.example.daggerandroidinjection

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.HasAndroidInjector
import di.DaggerMainComponent
import javax.inject.Inject

class MainApplication() : Application(), HasAndroidInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        DaggerMainComponent.create().inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> {
       return activityInjector
    }
}