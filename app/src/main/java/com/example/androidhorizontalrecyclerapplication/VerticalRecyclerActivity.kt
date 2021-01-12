package com.example.androidhorizontalrecyclerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidhorizontalrecyclerapplication.databinding.ActivityMainBinding
import com.example.androidhorizontalrecyclerapplication.databinding.ActivityVerticalRecyclerBinding

class VerticalRecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityVerticalRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}