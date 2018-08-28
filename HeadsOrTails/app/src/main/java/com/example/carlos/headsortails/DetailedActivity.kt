package com.example.carlos.headsortails

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.ImageView

class DetailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val image = findViewById<ImageView>(R.id.moedaId)
        var backButton = findViewById<ImageView>(R.id.botaoVoltarId)

        var extra = intent.extras

        if (extra != null) {
            val option = extra.getString("options")
            when(option){
                "cara" -> image.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara))
                "coroa" -> image.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa))
            }
        }

        backButton.setOnClickListener {
            startActivity(Intent(this@DetailedActivity, MainActivity::class.java))
        }

    }
}
