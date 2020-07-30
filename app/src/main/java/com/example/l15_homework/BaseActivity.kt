package com.example.l15_homework

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    protected fun showToast(str : String){
        Toast.makeText(applicationContext, str, Toast.LENGTH_LONG).show()
    }
}