package com.example.spotifake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        supportActionBar?.title = "Playlists"
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId) {
            R.id.btn_funk -> {
                val arrayAdapter: ArrayAdapter<*>
                val funk = arrayOf(
                    "ô moça", "Pernoite", "Evoque Prata", "Mds", "Toma Tapa", "Revoada"
                )
                var lista = findViewById<ListView>(R.id.listViewMusicas)
                arrayAdapter = ArrayAdapter(
                    this,
                    android.R.layout.simple_list_item_1, funk
                )
                lista.adapter = arrayAdapter
            }
        }
        when(item?.itemId) {
            R.id.btn_trap -> {
                val arrayAdapter: ArrayAdapter<*>
                val trap = arrayOf(
                    "Balmain", "Ai calica", "Licor 43", "NÉ SEGREDO"
                )
                var lista = findViewById<ListView>(R.id.listViewMusicas)
                arrayAdapter = ArrayAdapter(this,
                    android.R.layout.simple_list_item_1, trap
                )
                lista.adapter = arrayAdapter
            }
        }
        return super.onOptionsItemSelected(item)
    }
}