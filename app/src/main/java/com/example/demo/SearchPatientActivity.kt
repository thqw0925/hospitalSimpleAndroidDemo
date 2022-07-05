package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SearchPatientActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_patient)
    }

    public fun sendMessage11(view: View) {
        val intent = Intent(this, PatientActivity::class.java)
        startActivity(intent)
    }

    public fun sendMessage12(view: View) {
        val intent = Intent(this, PatientInActivity::class.java)
        startActivity(intent)
    }
}