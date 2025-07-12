package com.example.mobile_development_bootcamp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mobile_development_bootcamp.databinding.FragmentNewBinding
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobile_development_bootcamp.adapter.ToDoListAdapter
import com.example.mobile_development_bootcamp.model.dummyData


class NewFragment : Fragment() {

    private lateinit var binding: FragmentNewBinding
    private val toDoListAdapter by lazy { ToDoListAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvMain.layoutManager = LinearLayoutManager(requireContext())
        binding.rvMain.adapter = toDoListAdapter
        toDoListAdapter.submitList(dummyData)
    }
}
