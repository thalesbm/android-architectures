package com.example.android.mvvm.data.source

import android.util.Log
import com.example.android.mvvm.domain.model.EmployerModel
import java.util.*

class EmployerRemoteSourceImpl: EmployerSource {

    private val TAG = EmployerRemoteSourceImpl::class::simpleName.name

    override suspend fun saveEmployer(model: EmployerModel): Boolean {
        val random = Random()

        return if (random.nextBoolean()) {
            // user was saved with success
            Log.d(TAG, "EmployerRemoteSourceImpl::saveEmployer()::nextBoolean == true")
            true
        } else {
            // it was not possible to save the user
            Log.d(TAG, "EmployerRemoteSourceImpl::saveEmployer()::nextBoolean == false")
            false
        }
    }
}
