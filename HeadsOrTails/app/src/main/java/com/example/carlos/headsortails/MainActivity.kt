package com.example.carlos.headsortails

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val options: Array<String> = arrayOf("cara", "coroa")

        var buttonPlay = findViewById<ImageView>(R.id.botaoJogarId)

        buttonPlay.setOnClickListener{
            val rand = Random()
            val randomNumber = rand.nextInt(2)

            val intent = Intent(this@MainActivity, DetailedActivity::class.java)
            intent.putExtra("options", options[randomNumber])

            startActivity(intent)
        }

    }
}
