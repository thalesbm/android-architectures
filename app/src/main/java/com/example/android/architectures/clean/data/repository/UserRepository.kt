package com.example.android.architectures.clean.data.repository

import com.example.android.architectures.clean.data.DataCallback
import com.example.android.architectures.clean.domain.model.UserModel

interface UserRepository {

    fun saveUser(user: UserModel, callback: DataCallback)
}
