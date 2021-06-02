package com.example.intentdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnApply.setOnClickListener {
            val name=etname.text.toString()
            val age=etAge.text.toString().toInt()
            val country=etCountry.text.toString()
            val person=Person(name,age,country)

            Intent(this,Secondactivity::class.java).also {

                it.putExtra("EXTRA_PERSON",person)
//                it.putExtra("EXTRA_NAME",name)
//                it.putExtra("EXTRA_AGE",age)
//                it.putExtra("EXTRA_COUNTRY",country)

                startActivity(it)
            }

        }
    }
}