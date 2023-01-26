package com.example.factorialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.calculateBtn)
        val number: TextView = findViewById(R.id.editTextNumber)
        var res: TextView = findViewById(R.id.resultTextView)

        button.setOnClickListener{
            try{
                var factorial:Long = 1
                for(i in 1..number.text.toString().toInt()){
                    factorial *=i.toLong()
                }
                res.text = "Результат: $factorial"
            }
            catch(e:java.lang.NumberFormatException){
                println(e.message)
            }
        }
    }
}
