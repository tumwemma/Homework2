package com.lab2.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var foodArray= arrayListOf("Humburger", "Pizza", "Mexican","America","Chinese")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun addFood(view: View){
        foodArray.add(foodchose.text.toString())
        tvfoodDisplay.text=foodchose.text.toString()
        foodchose.hint="Add New Food"

    }

    fun decide(view: View){
        tvfoodDisplay.text= foodArray.random()
    }
}
