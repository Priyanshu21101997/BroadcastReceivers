package com.example.broadcastreceivers

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    // Late init is used if we want to initialise a variable late. But make sure to initialsie
    //it before accessing it.
    lateinit var airplaneModeChangedReceiver:AModeChangedReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        airplaneModeChangedReceiver = AModeChangedReceiver()

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also{
            registerReceiver(airplaneModeChangedReceiver,it)
        }

    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(airplaneModeChangedReceiver)
    }
}