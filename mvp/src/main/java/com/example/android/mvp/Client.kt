package com.example.android.mvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.android.mvp.view.ui.ClientActivity

data class Client(
    val activity: AppCompatActivity
) {

    class Builder {
        lateinit var activity: AppCompatActivity
            private set

        fun withActivity(act: AppCompatActivity) = apply { activity = act }

        fun build() {
            val intent = Intent(activity, ClientActivity::class.java)
            activity.startActivity(intent)
        }
    }
}