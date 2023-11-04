package com.example.mad_practical8_21012011010
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
class AlarmBroadcastReceiver : BroadcastReceiver() {
    companion object{
        val ALARM_KEY = "KEY"
        val ALARM_STOP = "STOP"
        val ALARM_START = "START"
    }
    override fun onReceive(context: Context, intent: Intent) {
// This method is called when the BroadcastReceiver is receiving an
        Intent broadcast.
        if(intent != null)
        {val data = intent.getStringExtra(ALARM_KEY)
            val intentService = Intent(context, AlarmService::class.java)
            if(data == ALARM_START)
            {context.startService(intentService)}
            else if(data == ALARM_STOP)
            {context.stopService(intentService)}
        }}}
