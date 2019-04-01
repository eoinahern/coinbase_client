package coinbaseclient.eoinahern.ie.coinbase.ui.view.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coinbaseclient.eoinahern.ie.coinbase.R
import coinbaseclient.eoinahern.ie.coinbase.ui.view.main.MainActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    private fun executeAnimation() {
        //todo: run an animation


        navigateNext()
    }

    private fun navigateNext() {
        startActivity(MainActivity.getIntent(this))
    }
}
