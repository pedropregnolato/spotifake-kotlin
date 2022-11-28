package com.example.spotifake

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_entrar.setOnClickListener {
            val playList = Intent(this, MenuActivity::class.java)
            startActivity(playList)
        }
            btn_esqueci.setOnClickListener {
                Toast.makeText(this, "Problema seu!", Toast.LENGTH_SHORT).show()
            }

    }
}

