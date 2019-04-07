package coinbaseclient.eoinahern.ie.coinbase.di

import coinbaseclient.eoinahern.ie.coinbase.ui.view.main.MainComponent
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun plus(): MainComponent
}