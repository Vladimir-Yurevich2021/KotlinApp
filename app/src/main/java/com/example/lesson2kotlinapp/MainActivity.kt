package com.example.lesson2kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson2kotlinapp.ui.main.MainFragment

class MainActivity : AppCompatActivity() {
   // private lateinit var binding: ResultProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}