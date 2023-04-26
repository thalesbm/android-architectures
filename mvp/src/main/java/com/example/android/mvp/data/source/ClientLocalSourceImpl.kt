package com.example.android.mvp.data.source

import android.util.Log
import com.example.android.mvp.data.DataCallback
import com.example.android.mvp.domain.model.ClientModel
import java.util.*

class ClientLocalSourceImpl: ClientSource {

    private val TAG = ClientLocalSourceImpl::class::simpleName.name

    override fun saveClient(user: ClientModel, callback: DataCallback) {
        val random = Random()

        if (random.nextBoolean()) {
            // user was saved with success
            Log.d(TAG, "ClientLocalSourceImpl::saveClient()::nextBoolean == true")
            callback.onSuccessful()
        } else {
            // it was not possible to save the user
            Log.d(TAG, "ClientLocalSourceImpl::saveClient()::nextBoolean == false")
            callback.onUnsuccessful()
        }
    }
}
