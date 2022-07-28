package com.example.afternoonandriod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
class CalculatorActivity : AppCompatActivity() {
    lateinit var Buttonadd: Button
    lateinit var Buttonsubtract:Button
    lateinit var Buttonmult:Button
    lateinit var Buttondivide:Button
    lateinit var Firstnumber:EditText
    lateinit var secondnumber:EditText
    lateinit var textanswer:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        Buttonadd = findViewById(R.id.btn_add)
        Buttonsubtract=findViewById(R.id.btn_subtract)
        Buttonmult=findViewById(R.id.btn_mult)
        Buttondivide=findViewById(R.id.btn_divide)
        Firstnumber = findViewById(R.id.editTextNumber)
        secondnumber = findViewById(R.id.editTextNumber2)
        textanswer = findViewById(R.id.txt_Answer)

        Buttonadd.setOnClickListener {
            val firstnum = Firstnumber.text.toString()
            val secondnum = secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()) {
                textanswer.text = "please enter all inputs"
            } else {
                val answer = firstnum.toDouble() + secondnum.toDouble()
                textanswer.text = answer.toString()
            }
        }
      Buttonmult.setOnClickListener {
          val firstnum=Firstnumber.text.toString()
          val secondnum=secondnumber.text.toString()
          if (firstnum.isEmpty() && secondnum.isEmpty()){
              textanswer.text ="please enter all inputs"
          }else {
              val answer=firstnum.toDouble() * secondnum.toDouble()
              textanswer.text =answer.toString()
          }
      }
        Buttonsubtract.setOnClickListener {
            val firstnum=Firstnumber.text.toString()
            val secondnum=secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                textanswer.text ="please enter all inputs"
            }else {
                val answer=firstnum.toDouble() - secondnum.toDouble()
                textanswer.text =answer.toString()
            }
        }
        Buttondivide.setOnClickListener {
            val firstnum=Firstnumber.text.toString()
            val secondnum=secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                textanswer.text ="please  enter all inputs"
            }else {
                val answer=firstnum.toDouble() / secondnum.toDouble()
                textanswer.text =answer.toString()
            }
        }
    }
}


