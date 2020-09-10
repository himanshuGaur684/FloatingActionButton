package com.room.floatingactionbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        first.setOnClickListener {
            makeToast("First Click")
        }
        second.setOnClickListener {
            makeToast("Second Click")
        }
        third.setOnClickListener {
            makeToast("Third Click")
        }
        fourth.setOnClickListener {
            makeToast("Fourth Click")
        }


    }

    private fun makeToast(msg:String){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }


}