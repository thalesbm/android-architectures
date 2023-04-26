package com.example.android.mvvm.data.source

import android.util.Log
import com.example.android.mvvm.domain.model.EmployerModel
import java.util.*

class EmployerLocalSourceImpl: EmployerSource {

    private val TAG = EmployerLocalSourceImpl::class::simpleName.name

    override suspend fun saveEmployer(model: EmployerModel): Boolean {
        val random = Random()

        return if (random.nextBoolean()) {
            // user was saved with success
            Log.d(TAG, "EmployerLocalSourceImpl::saveEmployer()::nextBoolean == true")
            true
        } else {
            // it was not possible to save the user
            Log.d(TAG, "EmployerLocalSourceImpl::saveEmployer()::nextBoolean == false")
            false
        }
    }
}
