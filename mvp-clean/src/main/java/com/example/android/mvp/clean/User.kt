package com.example.android.mvp.clean

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.android.mvp.clean.view.ui.UserActivity

data class User(
    val activity: AppCompatActivity
) {

    class Builder {
        lateinit var activity: AppCompatActivity
            private set

        fun withActivity(act: AppCompatActivity) = apply { activity = act }

        fun build() {
            val intent = Intent(activity, UserActivity::class.java)
            activity.startActivity(intent)
        }
    }
}