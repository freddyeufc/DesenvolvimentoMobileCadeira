package com.example.carlos.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.edInput)
        val button = findViewById<Button>(R.id.buttonResult)
        val textView = findViewById<TextView>(R.id.tvResult)


        button.setOnClickListener{
            val random = Random()
            val randomNumber = random.nextInt(11)
            val typedNumber = Integer.parseInt(editText.text.toString())

            textView.text = randomNumber.toString()

            when {
                randomNumber > typedNumber -> Toast.makeText(applicationContext, "O valor digitado ficou abaixo!", Toast.LENGTH_SHORT).show()
                randomNumber < typedNumber -> Toast.makeText(applicationContext, "O valor digitado ficou acima!", Toast.LENGTH_SHORT).show()
                else -> Toast.makeText(applicationContext, "Você Acertou!!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
