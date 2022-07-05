package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class StaffActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staff)

        val changeButton: Button = findViewById(R.id.button8)
        changeButton.setOnClickListener {
            val resultTextView: TextView = findViewById(R.id.textView17)
            resultTextView.text = "State: OFF"
        }
    }
}