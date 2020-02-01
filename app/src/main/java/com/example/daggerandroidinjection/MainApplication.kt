package com.example.daggerandroidinjection

import android.app.Application
import dagger.android.*
import di.DaggerMainComponent
import javax.inject.Inject

class MainApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerMainComponent.create();
    }
}