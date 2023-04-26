package com.example.android.mvvm.view.viewModel

sealed class EmployerState {

    object ShowSuccessfulMessage : EmployerState()
    object ShowUnsuccessfulMessage : EmployerState()
}
