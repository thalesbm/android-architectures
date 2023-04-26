package com.example.android.mvvm.domain.useCase

import android.util.Log
import com.example.android.mvvm.data.repository.EmployerRepository
import com.example.android.mvvm.domain.model.EmployerModel

class EmployerUseCaseImpl(private val repository: EmployerRepository) : EmployerUseCase {

    private val TAG = EmployerUseCaseImpl::class::simpleName.name

    override suspend fun saveEmployer(model: EmployerModel): Boolean {
        Log.d(TAG, "EmployerUseCaseImpl::saveEmployer()")
        return repository.saveEmployer(model)
    }
}