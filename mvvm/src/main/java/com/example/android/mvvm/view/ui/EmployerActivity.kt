package com.example.android.mvvm.view.ui

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.android.mvvm.R
import com.example.android.mvvm.domain.model.EmployerModel
import com.example.android.mvvm.view.viewModel.EmployerState
import com.example.android.mvvm.view.viewModel.EmployerViewModel
import com.example.android.mvvm.view.viewModel.EmployerViewModelFactory

class EmployerActivity : AppCompatActivity() {

    private val TAG = EmployerActivity::class::simpleName.name

    private lateinit var viewModel: EmployerViewModel

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employer)

        initViewModel()
        initViewModelStates()
        init()
    }

    private fun initViewModel() {
        val factor = EmployerViewModelFactory()
        viewModel = ViewModelProvider(this, factor)[EmployerViewModel::class.java]
    }

    private fun initViewModelStates() {
        viewModel.viewState.observe(this, Observer {
            when (it) {
                is EmployerState.ShowSuccessfulMessage -> showSuccessfulMessage()
                is EmployerState.ShowUnsuccessfulMessage -> showUnsuccessfulMessage()
            }
        })
    }

    private fun init() {
        button = findViewById(R.id.button)
        button.setOnClickListener {
            pressedButton()
        }
    }

    private fun pressedButton() {
        Log.d(TAG, "EmployerActivity::pressedButton()")
        viewModel.saveEmployer(simulateEmployer())
    }

    private fun showSuccessfulMessage() {
        Log.e(TAG, "EmployerActivity::showSuccessfulMessage()")
        Toast.makeText(this, "showSuccessfulMessage()", Toast.LENGTH_LONG).show()
    }

    private fun showUnsuccessfulMessage() {
        Log.e(TAG, "EmployerActivity::showUnsuccessfulMessage()")
        Toast.makeText(this, "showUnsuccessfulMessage()", Toast.LENGTH_LONG).show()
    }

    private fun simulateEmployer() = EmployerModel(
        id =  1L,
        name = "Thales",
        surname = "Bertolini",
        email = "thales.bm92@gmail.com",
        age =  30
    )
}
