package coinbaseclient.eoinahern.ie.coinbase

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import coinbaseclient.eoinahern.ie.coinbase.di.AppComponent
import coinbaseclient.eoinahern.ie.coinbase.di.AppModule
import coinbaseclient.eoinahern.ie.coinbase.di.DaggerAppComponent

class CoinbaseApp : Application() {

    private lateinit var daggerComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
    }

    private fun createComponent() {
        daggerComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    fun getAppComponent(): AppComponent{
        return daggerComponent
    }


}