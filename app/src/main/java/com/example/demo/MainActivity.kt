package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage1(view: View) {
        val intent = Intent(this, SearchPatientActivity::class.java)
        startActivity(intent)
    }

    fun sendMessage2(view: View) {
        val intent = Intent(this, SearchDrugActivity::class.java)
        startActivity(intent)
    }

    fun sendMessage3(view: View) {
        val intent = Intent(this, SearchStaffActivity::class.java)
        startActivity(intent)
    }
}