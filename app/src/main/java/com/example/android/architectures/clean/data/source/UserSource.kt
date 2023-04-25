package com.example.android.architectures.clean.data.source

import com.example.android.architectures.clean.data.DataCallback
import com.example.android.architectures.clean.domain.model.UserModel

interface UserSource {

    fun saveUser(user: UserModel, callback: DataCallback)
}
