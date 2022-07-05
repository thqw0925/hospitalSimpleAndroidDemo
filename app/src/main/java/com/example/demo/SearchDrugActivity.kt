package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SearchDrugActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_drug)
    }

    public fun sendMessage21(view: View) {
        val intent = Intent(this, DrugActivity::class.java)
        startActivity(intent)
    }
}