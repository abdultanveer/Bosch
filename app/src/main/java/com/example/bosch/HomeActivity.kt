package com.example.bosch

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    lateinit var homeTv: TextView;
    //var nameEt: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        homeTv = findViewById(R.id.tvHome);
       var data:String? =  intent.extras?.getString("hkey")
        homeTv.text = data
    }
}