package com.example.kotlinactivitydemo

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var so1: Int = 0
    var so2: Int = 0

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        btnNextActivity.setOnClickListener {
//            so1 = edt_nhap_so_1.text.toString().toInt()
//            so2 = edt_nhap_so_2.text.toString().toInt()
//            var result = so1 + so2
//
//            tvKetqua.text = result.toString()
            startService(Intent(this@MainActivity, SongService::class.java))

        }
        btnStopServices.setOnClickListener {
            stopService(Intent(this@MainActivity, SongService::class.java))


        }






        Log.e("Test", "Khoi tao onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Test", "Khoi tao onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Test", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Test", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Test", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Test", "onDestroy")
    }

//    fun ClickNext(view: android.view.View) {
//        startActivity(Intent(this@MainActivity, MainActivity2::class.java));
//
//
//    }

}