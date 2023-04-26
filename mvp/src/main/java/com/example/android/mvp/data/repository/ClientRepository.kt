package com.example.android.mvp.data.repository

import com.example.android.mvp.data.DataCallback
import com.example.android.mvp.domain.model.ClientModel

interface ClientRepository {

    fun saveClient(user: ClientModel, callback: DataCallback)
}
