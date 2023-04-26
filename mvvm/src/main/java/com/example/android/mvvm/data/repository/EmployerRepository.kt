package com.example.android.mvvm.data.repository

import com.example.android.mvvm.domain.model.EmployerModel

interface EmployerRepository {

    suspend fun saveEmployer(model: EmployerModel): Boolean
}
