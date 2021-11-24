package com.example.evaluasimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnKonversiRupiah: Button = findViewById(R.id.btn_konversi_rupiah)
        btnKonversiRupiah.setOnClickListener(this)

        val btnKonversiSuhu: Button = findViewById(R.id.btn_konversi_suhu)
        btnKonversiSuhu.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_konversi_rupiah -> {
                val moveKonversiRupiah = Intent(this@MainActivity, KonversiRupiah::class.java)
                startActivity(moveKonversiRupiah)
            }
            R.id.btn_konversi_suhu -> {
                val moveKonversiSuhu = Intent(this@MainActivity, KonversiSuhu::class.java)
                startActivity(moveKonversiSuhu)
            }
        }
    }
}