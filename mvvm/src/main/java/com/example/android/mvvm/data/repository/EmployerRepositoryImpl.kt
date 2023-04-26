package com.example.android.mvvm.data.repository

import android.util.Log
import com.example.android.mvvm.data.source.EmployerSource
import com.example.android.mvvm.domain.model.EmployerModel
import java.util.*

class EmployerRepositoryImpl(
    private val localSource: EmployerSource,
    private val remoteSource: EmployerSource
) : EmployerRepository {

    private val TAG = EmployerRepositoryImpl::class::simpleName.name

    override suspend fun saveEmployer(model: EmployerModel): Boolean {
        val random = Random()

        return if (random.nextBoolean()) {
            Log.d(TAG, "EmployerRepositoryImpl::saveEmployer()::nextBoolean == true")
            remoteSource.saveEmployer(model)
        } else {
            // it was not possible to save the user
            Log.d(TAG, "EmployerRepositoryImpl::saveEmployer()::nextBoolean == false")
            localSource.saveEmployer(model)
        }
    }
}
