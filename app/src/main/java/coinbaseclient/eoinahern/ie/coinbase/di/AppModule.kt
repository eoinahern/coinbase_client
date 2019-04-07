package coinbaseclient.eoinahern.ie.coinbase.di

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import coinbaseclient.eoinahern.ie.coinbase.CoinbaseApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val App: CoinbaseApp) {

    @Singleton
    @Provides
    fun getContext(): Context {
        return App.applicationContext
    }

    @Provides
    @Singleton
    fun getSharedPrefs(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

}