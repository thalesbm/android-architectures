package com.example.android.mvp.view.presenter

import android.util.Log
import com.example.android.mvp.data.DataCallback
import com.example.android.mvp.data.repository.ClientRepository
import com.example.android.mvp.domain.model.ClientModel
import com.example.android.mvp.view.ui.ClientView

class ClientPresenterImpl(
    private val view: ClientView,
    private val repository: ClientRepository
) : ClientPresenter {

    private val TAG = ClientPresenterImpl::class::simpleName.name

    override fun saveClient(client: ClientModel) {
        repository.saveClient(client, object : DataCallback{
            override fun onSuccessful() {
                Log.d(TAG, "ClientPresenterImpl::showSuccessfulMessage()")
                view.showSuccessfulMessage()
            }

            override fun onUnsuccessful() {
                Log.d(TAG, "ClientPresenterImpl::showUnsuccessfulMessage()")
                view.showUnsuccessfulMessage()
            }
        })
    }
}
