package com.example.iteradmin.kotlin_june4

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadCastReceiver: BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        val s:String?=p1?.action
        when(s){
            Intent.ACTION_POWER_CONNECTED ->{
                Toast.makeText(p0,"charging",Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_POWER_DISCONNECTED ->{
                Toast.makeText(p0,"not charging",Toast.LENGTH_LONG).show()
            }
        }
    }

}