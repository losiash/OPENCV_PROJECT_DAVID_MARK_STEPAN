package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edittext = findViewById<EditText>(R.id.edr)
        val button = findViewById<Button>(R.id.pardon)
        button.setOnClickListener {
            println(edittext.text)
        }
        fun double(edittext:Int): Int{
           val result=double(2)
           return result
        }
    }
}
