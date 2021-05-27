package com.example.todoapp

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat

const val NOTIFICATION_ID = "notification-id"
const val NOTIFICATION = "notification"
class NotificationPublisher : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            val notificationManager = ContextCompat.getSystemService(
                context,
                NotificationManager::class.java
            ) as NotificationManager
            val notification = intent.getParcelableExtra(NOTIFICATION)
            val id = intent.getExtra(NOTIFICATION_ID, 0)
            notificationManager.notify(id, notification)
        }
    
    }
    }
}