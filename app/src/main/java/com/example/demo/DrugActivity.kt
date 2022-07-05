package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class DrugActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drug)

        val rollButton: Button = findViewById(R.id.button7)
        val stringInTextField: EditText = findViewById(R.id.editTextTextPersonName3)
        val str1 = stringInTextField.text
        rollButton.setOnClickListener {
            val resultTextView: TextView = findViewById(R.id.textView11)
            resultTextView.text = "Price: $str1"
        }
    }
}