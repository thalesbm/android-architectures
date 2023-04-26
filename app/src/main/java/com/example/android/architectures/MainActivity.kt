package com.example.android.architectures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.mvp.Client
import com.example.android.mvp.clean.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        User.Builder()
            .withActivity(this)
            .build()

        Client.Builder()
            .withActivity(this)
            .build()
    }
}