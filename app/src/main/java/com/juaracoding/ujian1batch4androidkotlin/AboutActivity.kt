package com.juaracoding.ujian1batch4androidkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // Setting text for TextViews
        findViewById<TextView>(R.id.txtNama).text = "Nama : Gusto Ginting"
        findViewById<TextView>(R.id.txtEmail).text = "Email : gustoginting@gmail.com"

        // Button click event
        val continueButton = findViewById<Button>(R.id.btnNext)
        continueButton.setOnClickListener {
            // Intent to navigate to MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
