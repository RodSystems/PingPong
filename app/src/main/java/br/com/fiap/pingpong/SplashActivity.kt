package br.com.fiap.pingpong

import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.HandlerCompat.postDelayed
import android.content.Intent as Intent1
import android.os.Bundle as Bundle1

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        handler({},postDelayed({
            val intent = Intent1(package:this, PlayerA)
        } )

    }
}
