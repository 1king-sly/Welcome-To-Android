package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var greetingTextView =findViewById<TextView>(R.id.tvHello)
        val inputField = findViewById<EditText>(R.id.tvName)
        val btnSubmit = findViewById<Button>(R.id.BtnSubmit)
         val btnNext = findViewById<Button>(R.id.BtnNext)
        btnSubmit.setOnClickListener {
            val enteredName = inputField.text.toString()
            if (enteredName == ""){
                btnNext.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "Please Enter A Name",
                    Toast.LENGTH_SHORT).show()
                    greetingTextView.text = ""
            }else{
                val message = "Welcome $enteredName"
                greetingTextView.text = message
                inputField.text.clear()
                btnNext.visibility = VISIBLE
            }

        }
    }
}