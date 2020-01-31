package di

import com.example.daggerandroidinjection.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector


@Subcomponent
interface MainActivitySubcomponent : AndroidInjector<MainActivity> {

    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<MainActivity>
}