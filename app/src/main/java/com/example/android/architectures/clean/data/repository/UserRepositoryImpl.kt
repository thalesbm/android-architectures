package com.example.android.architectures.clean.data.repository

import android.util.Log
import com.example.android.architectures.clean.data.DataCallback
import com.example.android.architectures.clean.data.source.UserSource
import com.example.android.architectures.clean.domain.model.UserModel
import java.util.*

class UserRepositoryImpl(
    private val localSource: UserSource,
    private val remoteSource: UserSource
) : UserRepository {

    private val TAG = UserRepositoryImpl::class::simpleName.name

    override fun saveUser(user: UserModel, callback: DataCallback) {
        val random = Random()

        if (random.nextBoolean()) {
            Log.d(TAG, "UserRepositoryImpl::saveUser()::nextBoolean == true")
            remoteSource.saveUser(user, callback)
        } else {
            // it was not possible to save the user
            Log.d(TAG, "UserRepositoryImpl::saveUser()::nextBoolean == false")
            localSource.saveUser(user, callback)
        }
    }
}
