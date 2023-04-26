package com.example.android.architectures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.android.mvp.Client
import com.example.android.mvp.clean.User
import com.example.android.mvvm.Employer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMVVM = findViewById<Button>(R.id.goToMVVM)
        buttonMVVM.setOnClickListener {
            Employer.Builder().withActivity(this).build()
        }

        val buttonMVI = findViewById<Button>(R.id.goToMVI)
        buttonMVI.setOnClickListener {

        }

        val buttonMVP = findViewById<Button>(R.id.goToMVP)
        buttonMVP.setOnClickListener {
            Client.Builder().withActivity(this).build()
        }

        val buttonMVPClean = findViewById<Button>(R.id.goToMVPClean)
        buttonMVPClean.setOnClickListener {
            User.Builder().withActivity(this).build()
        }
    }
}