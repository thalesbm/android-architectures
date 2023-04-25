package com.example.android.architectures.clean.domain.useCase

import com.example.android.architectures.clean.domain.model.UserModel

interface UserUseCase {

    fun saveUser(user: UserModel)
}
