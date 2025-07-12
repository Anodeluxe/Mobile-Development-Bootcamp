package com.example.mobile_development_bootcamp

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.LayoutInflaterCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobile_development_bootcamp.adapter.ToDoListAdapter
import com.example.mobile_development_bootcamp.databinding.ActivityMainBinding
import com.example.mobile_development_bootcamp.model.dummyData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val ToDoListAdapter by lazy { ToDoListAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        binding.rvMain.layoutManager = LinearLayoutManager(this)
//
//
//        binding.rvMain.adapter = ToDoListAdapter
//        ToDoListAdapter.submitList(dummyData)

    }
}