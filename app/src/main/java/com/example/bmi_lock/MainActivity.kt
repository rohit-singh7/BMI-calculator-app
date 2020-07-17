package com.example.bmi_lock

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.graphics.Color.GREEN

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultsTextView.visibility = View.INVISIBLE
        calculateButton.setOnClickListener(){ // code here will be ran when calculateButton is clicked. } }
            var weight = weightEditText.text.toString().toDouble()

            var height = heightEditText.text.toString().toDouble()
            var bmi = weight / (height * height)
            //resultsTextView.visibility = View.VISIBLE
            //resultsTextView.text = "BMI: " + bmi

            val resultIntent = Intent(this,Main2Activity:: class.java)
            resultIntent.putExtra("result","BMI: " + String.format("%.2f",bmi))
            startActivity(resultIntent) }






    }
}
