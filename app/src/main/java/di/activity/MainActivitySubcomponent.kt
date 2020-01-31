package di.activity

import com.example.daggerandroidinjection.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector


@Subcomponent(modules = [MainActivitySubModule::class])
interface MainActivitySubcomponent : AndroidInjector<MainActivity> {

    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<MainActivity>
}