package com.example.sevens

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToActivityContent(view: View) {
        // Do something in response to button clickaa

        val btn: ImageButton = findViewById<ImageButton>(R.id.goButton) as ImageButton
        btn.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    activity_content::class.java
                )
            )
        })
    }

}