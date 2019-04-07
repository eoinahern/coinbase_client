package coinbaseclient.eoinahern.ie.coinbase.ui.view.main

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coinbaseclient.eoinahern.ie.coinbase.CoinbaseApp
import coinbaseclient.eoinahern.ie.coinbase.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var sharedPrefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inject()
    }

    private fun inject() {
        (application as CoinbaseApp).getAppComponent().plus().inject(this)
    }

    companion object {
        fun getIntent(context: Context): Intent = Intent(context, MainActivity::class.java)
    }
}
