package com.example.kotlinactivitydemo

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder


class SongService : Service() {

    var mediaPlayer:MediaPlayer?=null

    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onCreate() {
        super.onCreate()

        mediaPlayer = MediaPlayer.create(applicationContext,R.raw.songgio)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        mediaPlayer?.start()
        return START_STICKY


    }

    override fun onDestroy() {
        mediaPlayer?.release()
        super.onDestroy()
    }
}