package com.example.examenrecuperacion

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    companion object {
        const val PARAM1 = "Hola"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val boton4 = findViewById<Button>(R.id.boton4)
        val edText = findViewById<EditText>(R.id.editText)
        val tView = findViewById<TextView>(R.id.textView2)
        val NumeroRadom2 = (1..5).random()

        val texto =intent.getStringExtra(PARAM1)

        edText.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                boton4.isEnabled = edText.length() > 0
                }

        })

        boton4.setOnClickListener{
           tView.setText("$NumeroRadom2")
                if (tView.length()>0){

                }

        }

        boton4.setOnClickListener{
            Toast.makeText(this, "cambiar el texto primero", Toast.LENGTH_SHORT).show()
            }

        }

    }




























