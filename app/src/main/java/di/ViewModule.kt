package di

import com.example.daggerandroidinjection.MainActivity
import com.example.daggerandroidinjection.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ViewModule {
    @ContributesAndroidInjector
    abstract fun contributesMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [MainFragmentSubmodule::class])
    abstract fun contributesMainFragment(): MainFragment
}