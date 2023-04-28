package com.example.a10122914latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
    fun REGISTER(view: View?) {
        val intent = Intent(this@register, verify::class.java)
        startActivity(intent)
    }
}