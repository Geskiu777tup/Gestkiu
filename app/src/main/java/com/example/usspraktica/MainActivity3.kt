package com.example.usspraktica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }
    fun vpered(view: View) {
        val sw = view as Switch
        if (sw.isChecked) {

            val intent = Intent(this@MainActivity3, MainActivity4::class.java)
            startActivity(intent)
        }
    }

    fun tyutyu(view: View) {
        val intent = Intent(this@MainActivity3,MainActivity6::class.java)
        startActivity(intent)
    }
    fun trtr(view: View) {
        val intent = Intent(this@MainActivity3,MainActivity5::class.java)
        startActivity(intent)

    }
    fun jfgfgjf(view: View) {
        val intent = Intent(this@MainActivity3,MainActivity7::class.java)
        startActivity(intent)
    }
    fun fghgfhgfh(view: View) {
        val intent = Intent(this@MainActivity3,MainActivity10::class.java)
        startActivity(intent)
    }
    fun jjjhg(view: View) {
        val intent = Intent(this@MainActivity3,MainActivity9::class.java)
        startActivity(intent)
    }
    fun hjkghkghk(view: View) {
        val intent = Intent(this@MainActivity3,MainActivity8::class.java)
        startActivity(intent)
    }


}



