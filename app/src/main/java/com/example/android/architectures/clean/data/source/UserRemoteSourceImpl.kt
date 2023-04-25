package com.example.android.architectures.clean.data.source

import android.util.Log
import com.example.android.architectures.clean.data.DataCallback
import com.example.android.architectures.clean.domain.model.UserModel
import java.util.*

class UserRemoteSourceImpl: UserSource {

    private val TAG = UserRemoteSourceImpl::class::simpleName.name

    override fun saveUser(user: UserModel, callback: DataCallback) {
        val random = Random()

        if (random.nextBoolean()) {
            // user was saved with success
            Log.d(TAG, "UserRemoteSourceImpl::saveUser()::nextBoolean == true")
            callback.onSuccessful()
        } else {
            // it was not possible to save the user
            Log.d(TAG, "UserRemoteSourceImpl::saveUser()::nextBoolean == false")
            callback.onUnsuccessful()
        }
    }
}
