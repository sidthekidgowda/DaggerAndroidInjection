package di

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MainActivitySubModule {
    @Provides
    @Named("HelloWorld")
    fun provideHelloWorld() : String {
        return "Hello Dagger Android Injection"
    }
}