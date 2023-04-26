package com.example.android.mvp.view.presenter

import com.example.android.mvp.domain.model.ClientModel

interface ClientPresenter {

    fun saveClient(client: ClientModel)
}
