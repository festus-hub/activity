package com.example.afternoonandriod
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class MainActivity : AppCompatActivity() {
    lateinit var buttoncal:Button
    lateinit var buttonweb:Button
    lateinit var buttonIntent:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttoncal=findViewById(R.id.btn_cal)
        buttonweb=findViewById(R.id.btn_web)
        buttonIntent=findViewById(R.id.btn_int)
        buttoncal.setOnClickListener {
            val intent=Intent(this,CalculatorActivity::class.java)
            startActivity(intent)}
        buttonweb.setOnClickListener {
            val web=Intent(this,WebActivity::class.java)
            startActivity(web) }
         buttonIntent.setOnClickListener {
             val cal=Intent(this,IntentActivity::class.java)
             startActivity(cal) }

        }

    }
