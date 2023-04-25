package com.example.android.mvp.clean.domain.useCase

import com.example.android.mvp.clean.domain.model.UserModel

interface UserUseCase {

    fun saveUser(user: UserModel)
}
