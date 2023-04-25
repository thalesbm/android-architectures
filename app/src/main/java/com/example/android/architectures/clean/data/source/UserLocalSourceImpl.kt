package com.example.android.architectures.clean.data.source

import android.util.Log
import com.example.android.architectures.clean.data.DataCallback
import com.example.android.architectures.clean.domain.model.UserModel
import java.util.*

class UserLocalSourceImpl: UserSource {

    private val TAG = UserLocalSourceImpl::class::simpleName.name

    override fun saveUser(user: UserModel, callback: DataCallback) {
        val random = Random()

        if (random.nextBoolean()) {
            // user was saved with success
            Log.d(TAG, "UserLocalSourceImpl::saveUser()::nextBoolean == true")
            callback.onSuccessful()
        } else {
            // it was not possible to save the user
            Log.d(TAG, "UserLocalSourceImpl::saveUser()::nextBoolean == false")
            callback.onUnsuccessful()
        }
    }
}
