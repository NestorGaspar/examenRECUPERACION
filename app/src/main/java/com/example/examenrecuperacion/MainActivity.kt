package com.example.examenrecuperacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton1 = findViewById<Button>(R.id.boton1)
        val boton2 = findViewById<Button>(R.id.boton2)
        val boton3 = findViewById<Button>(R.id.boton3)
        val textview = findViewById<TextView>(R.id.textView)
        val NumeroRandom = (9999..99999).random()

        boton1.setOnClickListener{
            textview.setText("")
            boton1.isEnabled = textview.text.isNotEmpty()
        }

        boton2.setOnClickListener{
            textview?.let {
                val a = it.text
                it.text = "$a + $NumeroRandom"
                boton1.isEnabled = textview.text.isNotEmpty()
                boton3.isEnabled = textview.text.isNotEmpty()
            }

        }


        boton3.setOnClickListener {
            val text = textview.text
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(SecondActivity.PARAM1, text.toString())
            startActivity(intent)
        }

    }
}