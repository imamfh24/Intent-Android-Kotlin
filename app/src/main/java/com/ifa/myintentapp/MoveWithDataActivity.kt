package com.ifa.myintentapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_move_with_data.*

class MoveWithDataActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        setView()
    }

    private fun setView() {
        val tvDataReceived: TextView = findViewById(R.id.tv_data_received)
    }

    override fun onStart() {
        super.onStart()
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)

        val text = "Name: $name, Your Age: $age"
        tv_data_received.text = text
    }
}