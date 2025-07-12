package com.example.mobile_development_bootcamp.model

data class ToDoListData(
    val id: Int,
    val title: String,
    //val deadline: date
)

val dummyData = listOf<ToDoListData>(
    ToDoListData(1, "Stretching Pagi"),
    ToDoListData(2, "Tugas Bootcamp Mobdev"),
    ToDoListData(3, "ambil koran"),
    ToDoListData(4, "jogging malam"),
    ToDoListData(5, "beli kado untuk A")
)