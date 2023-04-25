package com.example.android.mvp.clean.data.repository

import com.example.android.mvp.clean.data.DataCallback
import com.example.android.mvp.clean.domain.model.UserModel

interface UserRepository {

    fun saveUser(user: UserModel, callback: DataCallback)
}
