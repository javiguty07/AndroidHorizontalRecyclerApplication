package com.example.androidhorizontalrecyclerapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.androidhorizontalrecyclerapplication.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var fragmentVertical: Fragment
    lateinit var fragmentHorizontal: Fragment
    lateinit var transaction: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonVertical.setOnClickListener {

            intent = Intent(this, VerticalRecyclerActivity::class.java)
            startActivity(intent)
        }

    }
}