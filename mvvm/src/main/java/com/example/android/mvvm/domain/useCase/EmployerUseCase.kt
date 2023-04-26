package com.example.android.mvvm.domain.useCase

import com.example.android.mvvm.domain.model.EmployerModel

interface EmployerUseCase {

    suspend fun saveEmployer(model: EmployerModel): Boolean
}
