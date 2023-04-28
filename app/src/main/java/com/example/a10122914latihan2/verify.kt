package com.example.a10122914latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class verify : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)
    }
    fun VERIFY(view: View?) {
        val intent = Intent(this@verify, verify2::class.java)
        startActivity(intent)
    }
}