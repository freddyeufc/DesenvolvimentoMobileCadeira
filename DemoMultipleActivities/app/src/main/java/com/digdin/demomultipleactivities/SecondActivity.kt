package com.digdin.demomultipleactivities

import android.os.Bundle
import android.app.Activity
import android.view.View

import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var closeButton = findViewById<View>(R.id.close)
        closeButton.setOnClickListener{
            finish()
        }
    }



}
