package com.example.evaluasimobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class KonversiRupiah : AppCompatActivity(), View.OnClickListener {
    private lateinit var etInputUang: EditText
    private lateinit var tvHasilKonversiRupiah: TextView
    private lateinit var btnDollar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_rupiah)
        supportActionBar?.title = "Konversi Rupiah"

        etInputUang = findViewById(R.id.et_input_uang)
        tvHasilKonversiRupiah = findViewById(R.id.tv_hasil_konversi_rupiah)
        btnDollar = findViewById(R.id.btn_dollar)

        btnDollar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_dollar) {
            val inputUang = etInputUang.text.toString().trim()
            var isEmptyFields = false

            if (inputUang.isNotEmpty()) {
                val hasilDollar = inputUang.toDouble() / 15000
                tvHasilKonversiRupiah.text = "$" + hasilDollar.toString()
            }
            else {
                etInputUang.error = "Field tidak boleh kosong!"
            }
        }
    }
}