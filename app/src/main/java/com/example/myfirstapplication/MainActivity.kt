package com.example.myfirstapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast_button.setOnClickListener(View.OnClickListener {
            val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
            myToast.show()
        })
        count_button.setOnClickListener(View.OnClickListener {
            val showCountTextView = findViewById<TextView>(R.id.textView)

            // Get the value of the text view.
            val countString = showCountTextView.text.toString()

            // Convert value to a number and increment it
            var count: Int = Integer.parseInt(countString)
            count++

            // Display the new value in the text view.
            showCountTextView.text = count.toString();
        })
        random_button.setOnClickListener(View.OnClickListener {
            val randomIntent = Intent(this, SecondActivity::class.java)
            // Get the current value of the text view.
            val countString = textView.text.toString()

            // Convert the count to an int
            val count = Integer.parseInt(countString)

            // Add the count to the extras for the Intent.
            randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
// Start the new activity.
            startActivity(randomIntent)
        })
    }


    }

