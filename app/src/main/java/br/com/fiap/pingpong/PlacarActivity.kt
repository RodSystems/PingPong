package br.com.fiap.pingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_placar.*
import kotlinx.android.synthetic.main.activity_player.*

class PlacarActivity : AppCompatActivity() {

    var scorePlaye1 = 0
    var scorePlaye2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)

        if (savedInstanceState != null){
            scorePlaye1 = savedInstanceState.getInt("score_player_1",0)
            scorePlaye2 = savedInstanceState.getInt("score_player_2",0)

            tvScorePlayer1.text = scorePlaye1.toString()
            tvScorePlayer2.text = scorePlaye2.toString()
            
        }


       // btnInicioPartida.setOnClickListener{
       //    val intent = Intent(this,PlacarActivity::class.java)
       //     startActivity(intent)
       // }
        setUpExtras()
        startGame()

        btnPlayer1.setOnClickListener{
            scorePlaye1++
            tvScorePlayer1.text = scorePlaye1.toString()
        }

        btnPlayer2.setOnClickListener{
            scorePlaye2++
            tvScorePlayer2.text = scorePlaye2.toString()
        }

    }

    private fun startGame() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        tvScorePlayer1.text = scorePlaye1.toString()
        tvScorePlayer2.text = scorePlaye2.toString()
    }

    private fun setUpExtras() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        tvNamePlayer1.text = intent.getStringExtra("Player_1") ?: "Player 1"
        tvNamePlayer2.text = intent.getStringExtra("Player_2") ?: "Player 2"
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

    }
}
