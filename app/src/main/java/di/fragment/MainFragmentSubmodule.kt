package di.fragment

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MainFragmentSubmodule {

    @Provides
    @Named("HelloDaggerAndroid")
    fun provideHelloDaggerAndroid() : String {
        return "Hello Dagger Android!"
    }
}