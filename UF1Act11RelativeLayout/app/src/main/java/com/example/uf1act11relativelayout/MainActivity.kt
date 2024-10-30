package com.example.uf1act11relativelayout

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editTextNom = findViewById<EditText>(R.id.editTextText)
        val editTextCognom = findViewById<EditText>(R.id.editTextText2)
        val editNumberEdat = findViewById<EditText>(R.id.editTextNumberDecimal)
        val editTextUsuari = findViewById<EditText>(R.id.editTextText3)
        val passwordAuthentication = findViewById<EditText>(R.id.editTextTextPassword)
        val editPhoneTelefon = findViewById<EditText>(R.id.editTextPhone)
        val editEmailCorreu = findViewById<EditText>(R.id.editTextTextEmailAddress)

        val button = findViewById<Button>(R.id.button)

        val genere = findViewById<RadioGroup>(R.id.radioGroup)



        button.setOnClickListener {

            if (editTextNom.text.isNotBlank() && editTextCognom.text.isNotBlank() && editNumberEdat.text.isNotBlank() && editTextUsuari.text.isNotBlank() && passwordAuthentication.text.isNotBlank() && genere.checkedRadioButtonId != -1 && editPhoneTelefon.text.isNotBlank() && editEmailCorreu.text.isNotBlank()) {

                Toast.makeText(this, "Registre Complet", Toast.LENGTH_SHORT).show()


            } else {

                Toast.makeText(this, "No s'han omplert tots els camps", Toast.LENGTH_SHORT).show()
            }

        }


    }
}