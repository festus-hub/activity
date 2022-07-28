package com.example.afternoonandriod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntentActivity : AppCompatActivity() {
    lateinit var Buttonsms:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        Buttonsms=findViewById(R.id.btn_sms)
        Buttonsms.setOnClickListener {

        }
    }
}