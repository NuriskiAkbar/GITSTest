package com.riquest.gitsquest4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_push.setOnClickListener {
            var getstring = et_string.text.toString()
            var reverseStr = getstring.reversed()

            tv_result.setText(reverseStr)
        }
    }
}
