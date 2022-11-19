package com.example.databindingsampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingsampleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

     val  binding: ActivityMainBinding = DataBindingUtil.setContentView(
         this,R.layout.activity_main)
//        val txtName = findViewById<TextView>(R.id.textView1)
//        txtName.text = "hello OOO"
//binding.textView1.text = "helloooo"
        binding.name="hHHelllo1"
        binding.button.setOnClickListener {

            binding.state = binding.state != true
        }

    }
}