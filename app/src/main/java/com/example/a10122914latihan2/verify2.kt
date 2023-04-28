package com.example.a10122914latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class verify2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify2)
    }
    fun SEND(view: View?) {
        val intent = Intent(this@verify2, home::class.java)
        startActivity(intent)
    }
}