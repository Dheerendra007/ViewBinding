package com.dk.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dk.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _viewBinding:ActivityMainBinding? = null
    private val binding get()= _viewBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _viewBinding = ActivityMainBinding.inflate(layoutInflater)
        println( binding.tvName)
    }

    override fun onDestroy() {
        super.onDestroy()
        _viewBinding = null
    }
}