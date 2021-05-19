package com.example.implicitintenttraining.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.implicitintenttraining.R
import com.example.implicitintenttraining.databinding.ActivitySecondBinding
import com.example.implicitintenttraining.util.Constants

class SecondActivity : BaseActivity<ActivitySecondBinding>() {
    override var inflateFunction: (LayoutInflater) -> ActivitySecondBinding=ActivitySecondBinding::inflate
    override fun setUp() {
        addCallBacks()
    }
    private fun addCallBacks() {
        binding.viewName.text=retrieveString()
    }

    private fun retrieveString():String{
        val intent:Intent=intent
        return intent.getStringExtra(Constants.IntentTags.mainActivityTag).toString()
    }

}