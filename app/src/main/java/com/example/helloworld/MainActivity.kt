package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity","Aziz")
        println("Hi there!")

        fun test(name: String){
            if (name == "Aziz"){
                println("Hi Aziz")
            } else {
                println("Where is Aziz?")
            }
        }

        test("Aziz")
    }
}