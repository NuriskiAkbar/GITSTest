package com.riquest.gitsquest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_push.setOnClickListener {
            var getnumber = et_number.text.toString()
            var number = getnumber.toInt()
            if (number % 3 == 0 && number % 5 ==0){
                tv_result.setText("Hello World")
            } else if(number % 3 == 0){
                tv_result.setText("Hello")
            } else if(number % 5 == 0){
                tv_result.setText("World")
            }else{
                tv_result.setText("Bukan kelipatan 3 atau 5")
            }
        }
    }
}