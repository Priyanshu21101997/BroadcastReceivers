package com.example.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class AModeChangedReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAModeEnabled = intent?.getBooleanExtra("state", false)
        if (isAModeEnabled != null) {
            if (isAModeEnabled)
                Toast.makeText(context, "Airplane Mode Enabled", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(context, "Airplane Mode Disabled", Toast.LENGTH_LONG).show()
        }
    }
}