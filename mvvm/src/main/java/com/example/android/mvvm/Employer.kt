package com.example.android.mvvm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.android.mvvm.view.ui.EmployerActivity

data class Employer(
    val activity: AppCompatActivity
) {

    class Builder {
        lateinit var activity: AppCompatActivity
            private set

        fun withActivity(act: AppCompatActivity) = apply { activity = act }

        fun build() {
            val intent = Intent(activity, EmployerActivity::class.java)
            activity.startActivity(intent)
        }
    }
}