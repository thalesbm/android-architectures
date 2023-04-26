package com.example.android.mvvm.view.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.mvvm.data.repository.EmployerRepositoryImpl
import com.example.android.mvvm.data.source.EmployerLocalSourceImpl
import com.example.android.mvvm.data.source.EmployerRemoteSourceImpl
import com.example.android.mvvm.domain.useCase.EmployerUseCaseImpl

class EmployerViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        val localSource = EmployerLocalSourceImpl()
        val remoteSource = EmployerRemoteSourceImpl()
        val repository = EmployerRepositoryImpl(localSource, remoteSource)
        val useCase = EmployerUseCaseImpl(repository)
        return EmployerViewModel(useCase) as T
    }
}
