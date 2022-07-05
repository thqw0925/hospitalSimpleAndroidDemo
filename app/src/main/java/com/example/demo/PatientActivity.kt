package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class PatientActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient)

        val checkButton: Button = findViewById(R.id.button9)
        checkButton.setOnClickListener {
            val resultTextView: TextView = findViewById(R.id.textView16)
            resultTextView.text = "State: OUT"
        }
    }

    fun sentText(view: View) {
        Toast.makeText(
            applicationContext,
            "Sent",
            Toast.LENGTH_LONG
        ).show()
    }
}