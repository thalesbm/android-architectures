package com.example.android.mvp.data.source

import com.example.android.mvp.data.DataCallback
import com.example.android.mvp.domain.model.ClientModel

interface ClientSource {

    fun saveClient(user: ClientModel, callback: DataCallback)
}
