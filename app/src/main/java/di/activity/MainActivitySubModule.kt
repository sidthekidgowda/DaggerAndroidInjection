package di.activity

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MainActivitySubModule {
    @Provides
    @Named("ActivityLog")
    fun provideLogs() : String {
        return "Fragment has been added"
    }
}