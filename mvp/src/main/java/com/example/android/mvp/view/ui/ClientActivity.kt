package com.example.android.mvp.view.ui

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.android.mvp.R
import com.example.android.mvp.data.repository.ClientRepositoryImpl
import com.example.android.mvp.data.source.ClientLocalSourceImpl
import com.example.android.mvp.data.source.ClientRemoteSourceImpl
import com.example.android.mvp.domain.model.ClientModel
import com.example.android.mvp.view.presenter.ClientPresenterImpl

class ClientActivity : AppCompatActivity(), ClientView {

    private val TAG = ClientActivity::class::simpleName.name

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client)

        init()
    }

    private fun init() {
        button = findViewById(R.id.button)
        button.setOnClickListener {
            pressedButton()
        }
    }

    private fun pressedButton() {
        Log.d(TAG, "ClientActivity::pressedButton()")

        val localSource = ClientLocalSourceImpl()
        val remoteSource = ClientRemoteSourceImpl()
        val repository = ClientRepositoryImpl(localSource, remoteSource)
        val presenter = ClientPresenterImpl(this, repository)

        val client = simulateClient()
        presenter.saveClient(client)
    }

    override fun showSuccessfulMessage() {
        Log.e(TAG, "ClientActivity::showSuccessfulMessage()")
        Toast.makeText(this, "showSuccessfulMessage()", Toast.LENGTH_LONG).show()
    }

    override fun showUnsuccessfulMessage() {
        Log.e(TAG, "ClientActivity::showUnsuccessfulMessage()")
        Toast.makeText(this, "showUnsuccessfulMessage()", Toast.LENGTH_LONG).show()
    }

    private fun simulateClient() = ClientModel(
        id =  1L,
        name = "Thales",
        surname = "Bertolini",
        email = "thales.bm92@gmail.com",
        age =  30
    )
}