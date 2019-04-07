package coinbaseclient.eoinahern.ie.coinbase.di

import androidx.appcompat.app.AppCompatActivity
import coinbaseclient.eoinahern.ie.coinbase.CoinbaseApp
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: CoinbaseApp)

}