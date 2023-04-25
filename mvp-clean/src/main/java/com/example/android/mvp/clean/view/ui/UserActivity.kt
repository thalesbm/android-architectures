package com.example.android.mvp.clean.view.ui

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.android.mvp.clean.R
import com.example.android.mvp.clean.data.repository.UserRepositoryImpl
import com.example.android.mvp.clean.data.source.UserLocalSourceImpl
import com.example.android.mvp.clean.data.source.UserRemoteSourceImpl
import com.example.android.mvp.clean.domain.model.UserModel
import com.example.android.mvp.clean.domain.useCase.UserUseCaseImpl
import com.example.android.mvp.clean.view.presenter.UserPresenterImpl

class UserActivity : AppCompatActivity(), UserView {

    private val TAG = UserActivity::class::simpleName.name

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        init()
    }

    private fun init() {
        button = findViewById(R.id.button)
        button.setOnClickListener {
            pressedButton()
        }
    }

    private fun pressedButton() {
        Log.d(TAG, "UserActivity::pressedButton()")

        val localSource = UserLocalSourceImpl()
        val remoteSource = UserRemoteSourceImpl()
        val presenter = UserPresenterImpl(this)
        val repository = UserRepositoryImpl(localSource, remoteSource)
        val useCase = UserUseCaseImpl(repository, presenter)

        val user = simulateUser()
        useCase.saveUser(user)
    }

    override fun showSuccessfulMessage() {
        Log.e(TAG, "UserActivity::showSuccessfulMessage()")
        Toast.makeText(this, "showSuccessfulMessage()", Toast.LENGTH_LONG).show()
    }

    override fun showUnsuccessfulMessage() {
        Log.e(TAG, "UserActivity::showUnsuccessfulMessage()")
        Toast.makeText(this, "showUnsuccessfulMessage()", Toast.LENGTH_LONG).show()
    }

    private fun simulateUser() = UserModel(
        id =  1L,
        name = "Thales",
        surname = "Bertolini",
        email = "thales.bm92@gmail.com",
        age =  30
    )
}