package com.example.android.mvp.clean.data.source

import com.example.android.mvp.clean.data.DataCallback
import com.example.android.mvp.clean.domain.model.UserModel

interface UserSource {

    fun saveUser(user: UserModel, callback: DataCallback)
}
