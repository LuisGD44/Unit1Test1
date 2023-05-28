package com.example.unit1test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.graphics.Color

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button2 = findViewById<Button>(R.id.button)
        val button3 = findViewById<Button>(R.id.button2)
        val button4 = findViewById<Button>(R.id.button3)
        val textView1 = findViewById<TextView>(R.id.textView1)

        button2.setOnClickListener {
            textView1.setTextColor(Color.GREEN)
        }

        button3.setOnClickListener {
            textView1.setTextColor(Color.RED)
        }

        button4.setOnClickListener {
            textView1.setTextColor(Color.YELLOW)
        }

    }
}