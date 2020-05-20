package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Garage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garage)

      val Fab = findViewById<FloatingActionButton>(R.id.fab)
       Fab.setOnClickListener {
           startActivity(Intent(this, Addcar::class.java))
           overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

       }

    }
}
