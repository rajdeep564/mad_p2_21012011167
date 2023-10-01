package com.example.mad_p2_21012011167

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate() method is called")
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart() method is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("OnResume() method is called")
    }
    override fun onPause() {
        super.onPause()
        showMessage("onPause() method is called")
    }
    override fun onStop() {
        super.onStop()
        showMessage("onStop() method is called")
    }
    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy() method is called")
    }
    fun showMessage(msg:String){
        Log.i(TAG, "$msg")
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.textView),msg, Snackbar.LENGTH_SHORT).show()
    }
}
