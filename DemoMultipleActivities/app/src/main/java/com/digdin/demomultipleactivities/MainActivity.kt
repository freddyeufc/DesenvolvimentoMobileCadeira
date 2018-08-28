package com.digdin.demomultipleactivities

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var next = findViewById<View>(R.id.ToSecond)
    }

    fun goNextActivity(view:View){
        val goNext = Intent(this@MainActivity, SecondActivity::class.java)
        startActivity(goNext)
    }
}
