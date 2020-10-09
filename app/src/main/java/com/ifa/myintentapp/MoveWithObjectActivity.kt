package com.ifa.myintentapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MoveWithObjectActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_PERSON = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        setView()
    }

    private fun setView() {
        val tvObject: TextView = findViewById(R.id.tv_object_received)

        val person = intent.getParcelableExtra<Person>(EXTRA_PERSON) as Person
        val text = "Name: ${person.name.toString()}, \nEmail: ${person.email}, \nAge: ${person.age}, \nCity: ${person.city}"
        tvObject.text = text
    }
}