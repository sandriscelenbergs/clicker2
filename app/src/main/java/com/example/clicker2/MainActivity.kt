package com.example.clicker2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainSpiedPogu.text = "Spied Mani"

        var click = 0

        mainSpiedPogu.setOnClickListener {
            click++
            val mainSkaitlis = "$click"
        }

    }

}