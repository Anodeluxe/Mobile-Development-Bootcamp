package com.example.mobile_development_bootcamp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mobile_development_bootcamp.databinding.ItemMainBinding
import com.example.mobile_development_bootcamp.model.ToDoListData

class ToDoListAdapter: ListAdapter<ToDoListData, ToDoListAdapter.MainViewHolder>(diffCallback) {
    inner class MainViewHolder(val binding: ItemMainBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ToDoListData) {
            with(binding) {
                tvTitle.text = item.title
                //tvDeadline.text = item.deadline
            }
        }
    }

    companion object {
        val diffCallback = object : DiffUtil.ItemCallback<ToDoListData>() {
            override fun areItemsTheSame(oldItem: ToDoListData, newItem: ToDoListData): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: ToDoListData, newItem: ToDoListData): Boolean {
                return oldItem == newItem
            }

        }
    }

    //setting layout apa yg akan ditampilkan
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val binding = ItemMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MainViewHolder(binding)
    }

    //menampilkan data ke layout
    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}