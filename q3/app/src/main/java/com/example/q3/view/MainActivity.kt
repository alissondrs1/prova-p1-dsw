package com.example.q3.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.q3.R
import com.example.q3.controller.ListViewModel
import kotlin.properties.ReadOnlyProperty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // val viewModel: MyActivityViewModel = MyActivityViewModel()
        val viewModel: ListViewModel by viewModels()

        // calling viewModel
        viewModel.loadEmail()
        viewModel.loadEmail()

    }

    private fun viewModels(): ReadOnlyProperty<Nothing?, ListViewModel> {

    }
}