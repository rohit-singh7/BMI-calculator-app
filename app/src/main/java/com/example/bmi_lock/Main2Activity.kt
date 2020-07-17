package com.example.bmi_lock

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bmi_lock.R.layout.activity_main2
import kotlinx.android.synthetic.main.activity_main2.*


class Main2Activity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main2)

    }

    override fun onStart() {
        super.onStart()
        val result = intent.extras?.getString("result")
        resultTextView.text = result


    }
}
