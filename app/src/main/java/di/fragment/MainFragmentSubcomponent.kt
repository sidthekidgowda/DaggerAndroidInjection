package di.fragment

import com.example.daggerandroidinjection.MainFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [MainFragmentSubmodule::class])
interface MainFragmentSubcomponent : AndroidInjector<MainFragment> {

    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<MainFragment>
}