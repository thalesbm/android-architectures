package com.example.android.architectures.clean.view.presenter

import android.util.Log
import com.example.android.architectures.clean.view.ui.UserView

class UserPresenterImpl(private val view: UserView): UserPresenter {

    private val TAG = UserPresenterImpl::class::simpleName.name

    override fun savedUserSuccessful() {
        Log.d(TAG, "UserPresenterImpl::savedUserSuccessful()")
        view.showSuccessfulMessage()
    }

    override fun savedUserUnsuccessful() {
        Log.d(TAG, "UserPresenterImpl::savedUserUnsuccessful()")
        view.showUnsuccessfulMessage()
    }
}
