package com.example.android.mvp.data.repository

import android.util.Log
import com.example.android.mvp.data.DataCallback
import com.example.android.mvp.data.source.ClientSource
import com.example.android.mvp.domain.model.ClientModel
import java.util.*

class ClientRepositoryImpl(
    private val localSource: ClientSource,
    private val remoteSource: ClientSource
) : ClientRepository {

    private val TAG = ClientRepositoryImpl::class::simpleName.name

    override fun saveClient(user: ClientModel, callback: DataCallback) {
        val random = Random()

        if (random.nextBoolean()) {
            Log.d(TAG, "ClientRepositoryImpl::saveUser()::nextBoolean == true")
            remoteSource.saveClient(user, callback)
        } else {
            // it was not possible to save the user
            Log.d(TAG, "ClientRepositoryImpl::saveUser()::nextBoolean == false")
            localSource.saveClient(user, callback)
        }
    }
}
