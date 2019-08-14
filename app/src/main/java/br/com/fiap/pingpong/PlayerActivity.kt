package br.com.fiap.pingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_player.*

class PlayerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        btnInicioPartida.setOnClickListener{
            val intent = Intent(this,PlacarActivity::class.java)
            intent.putExtra("player_1",inputPlayer1)
            intent.putExtra("Player_2", inputPlayer2)
            startActivity(intent)
        }
    }
}

