package com.swiftpizza.dialogfragmentexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.swiftpizza.dialogfragmentexample.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

    //this is main branch
    //this is pritesh branch

}