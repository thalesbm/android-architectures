package com.example.android.mvvm.data.source

import com.example.android.mvvm.domain.model.EmployerModel

interface EmployerSource {

    suspend fun saveEmployer(model: EmployerModel): Boolean
}
