package coinbaseclient.eoinahern.ie.coinbase.ui.view.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import coinbaseclient.eoinahern.ie.coinbase.R
import coinbaseclient.eoinahern.ie.coinbase.ui.view.main.MainActivity
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity() {

    private val job = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + job)
    private val iconImView: ImageView by lazy { findViewById<ImageView>(R.id.splash_icon) }
    private val animation: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.enlarge_animation) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        addAnimListener()
        executeAnimation()
    }

    private fun addAnimListener() {
        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationRepeat(animation: Animation?) {
            }

            override fun onAnimationStart(animation: Animation?) {
            }

            override fun onAnimationEnd(animation: Animation?) {
                navigateNext()
            }
        })
    }

    private fun executeAnimation() {
        uiScope.launch {
            iconImView.startAnimation(animation)
        }
    }

    private fun navigateNext() {
        startActivity(MainActivity.getIntent(this))
    }

    override fun onDestroy() {
        super.onDestroy()
        job.complete()
    }
}
