package com.canvarli.firstandroidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//burada butona tıkladığında isim değiştirme işlemini yapacağız.
//view adında View tipinde bir değişken oluşturduk.
    fun changeName(view : View){
        textView.text = "Merhaba Android";
    }

}