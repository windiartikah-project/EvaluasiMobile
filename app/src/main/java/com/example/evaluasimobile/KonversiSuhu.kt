package com.example.evaluasimobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class KonversiSuhu : AppCompatActivity(), View.OnClickListener {
    private lateinit var etInputSuhu: EditText
    private lateinit var tvHasilKonversiFahrenheit: TextView
    private lateinit var tvHasilKonversiReamur: TextView
    private lateinit var tvHasilKonversiKelvin: TextView
    private lateinit var btnSuhu: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_suhu)
        supportActionBar?.title = "Konversi Suhu"

        etInputSuhu = findViewById(R.id.et_input_suhu)
        tvHasilKonversiFahrenheit = findViewById(R.id.tv_hasil_konversi_fahrenheit)
        tvHasilKonversiReamur = findViewById(R.id.tv_hasil_konversi_reamur)
        tvHasilKonversiKelvin = findViewById(R.id.tv_hasil_konversi_kelvin)
        btnSuhu = findViewById(R.id.btn_suhu)

        btnSuhu.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_suhu) {
            val inputSuhu = etInputSuhu.text.toString().trim()

            if (inputSuhu.isNotEmpty()) {
                val hasilFahrenheit = (inputSuhu.toDouble() * 9/5) + 32
                tvHasilKonversiFahrenheit.text = hasilFahrenheit.toString() + " fahrenheit"

                val hasilReamur = inputSuhu.toDouble() * 4/5
                tvHasilKonversiReamur.text = hasilReamur.toString() + " reamur"

                val hasilKelvin = inputSuhu.toDouble() + 273
                tvHasilKonversiKelvin.text = hasilKelvin.toString() + " kelvin"
            }
            else {
                etInputSuhu.error = "Field tidak boleh kosong!"
            }
        }
    }
}