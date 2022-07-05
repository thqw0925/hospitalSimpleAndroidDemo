package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SearchStaffActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sreach_staff)
    }

    public fun sendMessage31(view: View) {
        val intent = Intent(this, StaffActivity::class.java)
        startActivity(intent)
    }
}