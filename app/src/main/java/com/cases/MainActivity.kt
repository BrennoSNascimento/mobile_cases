package com.cases

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val caso = findViewById<TextView>(R.id.Resposta)
        val resp = findViewById<EditText>(R.id.escolha)

        resp.addTextChangedListener {

            val num = if (!it.isNullOrBlank() || it.toString().isDigitsOnly()){
                 it.toString().toInt()
            }
            else
            {
                -1
            }
            when (num) {
                -1 -> caso.text = "digite um numero"
                 0 -> caso.text = "Abacaxi"
                 1 -> caso.text = "Laranja"
                 2 -> caso.text = "Limao"
                 3 -> caso.text = "goiaba"
                 4 -> caso.text = "Caju"
                 else -> caso.text = "não está presente no banco das frutas"
            }
        }


        }

    }



