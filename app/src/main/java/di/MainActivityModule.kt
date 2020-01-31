package di

import com.example.daggerandroidinjection.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [MainActivitySubcomponent::class])
abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    abstract fun mainAndroidInjectorFactory(factory: MainActivitySubcomponent.Factory) : AndroidInjector.Factory<*>
}