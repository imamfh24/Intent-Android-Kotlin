package com.ifa.myintentapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , View.OnClickListener{



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setView()
    }

    private fun setView() {
        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)

        setOnClickButton()
    }

    private fun setOnClickButton() {
        btn_move_activity.setOnClickListener(this)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this, MoveActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}