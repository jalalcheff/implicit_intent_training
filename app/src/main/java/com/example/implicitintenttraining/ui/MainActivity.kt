package com.example.implicitintenttraining.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.core.content.ContextCompat
import com.example.implicitintenttraining.databinding.ActivityMainBinding
import com.example.implicitintenttraining.util.Constants

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override var inflateFunction: (LayoutInflater) -> ActivityMainBinding=ActivityMainBinding::inflate
    override fun setUp() {
        addCallBacks()
    }

    private fun addCallBacks() {
        binding.buttonTransaction.setOnClickListener {
            translateData(binding.namesText.text.toString())
        }
    }
    fun translateData(data:Any)
    {
        val intent=Intent(Intent.ACTION_SEND)
        intent.putExtra(Constants.IntentTags.mainActivityTag,data.toString())
        startActivity(intent)
    }
}