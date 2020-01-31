package di.fragment

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MainFragmentSubmodule {

    @Provides
    @Named("Hello Android Injection")
    fun provideHelloDaggerAndroidInjection() : String {
        return "Hello Dagger Android Injection!"
    }
}