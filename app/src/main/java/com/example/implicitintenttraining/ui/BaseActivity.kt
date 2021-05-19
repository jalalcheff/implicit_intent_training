package com.example.implicitintenttraining.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<T: ViewBinding>: AppCompatActivity() {
    private lateinit var _binding: ViewBinding
    abstract  var inflateFunction:(LayoutInflater)->T
    protected val binding
        get() = _binding as T
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding=inflateFunction(layoutInflater)
        setContentView(_binding.root)
        setUp()
    }

    abstract fun setUp()


}