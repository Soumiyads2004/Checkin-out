package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        var x = 0
        var t1: TextView = findViewById(R.id.txt1)
        var b1: Button = findViewById(R.id.b1)
        var b2: Button = findViewById(R.id.b2)


        b1.setOnClickListener {
            x++
            t1.setText(x.toString())

        }
        b2.setOnClickListener {
            if (x > 0) {
                x--
                t1.setText(x.toString())
            }
        }
    }
}