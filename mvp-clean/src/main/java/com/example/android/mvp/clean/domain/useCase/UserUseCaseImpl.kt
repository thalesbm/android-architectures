package com.example.android.mvp.clean.domain.useCase

import android.util.Log
import com.example.android.mvp.clean.data.DataCallback
import com.example.android.mvp.clean.domain.model.UserModel
import com.example.android.mvp.clean.view.presenter.UserPresenter
import com.example.android.mvp.clean.data.repository.UserRepository

class UserUseCaseImpl(
    private val repository: UserRepository,
    private val presenter: UserPresenter
) : UserUseCase {

    private val TAG = UserUseCaseImpl::class::simpleName.name

    override fun saveUser(user: UserModel) {
        Log.d(TAG, "UserUseCaseImpl::saveUser()")

        repository.saveUser(user, callback = object : DataCallback {
            override fun onSuccessful() {
                presenter.savedUserSuccessful()
            }

            override fun onUnsuccessful() {
                presenter.savedUserUnsuccessful()
            }
        })
    }
}
