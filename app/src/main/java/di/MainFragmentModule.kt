package di

import com.example.daggerandroidinjection.MainFragment
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [MainFragmentSubmodule::class])
abstract class MainFragmentModule {

    @Binds
    @IntoMap
    @ClassKey(MainFragment::class)
    abstract fun bindMainFragmentFactory(factory: MainFragmentSubcomponent.Factory) : AndroidInjector.Factory<*>
}