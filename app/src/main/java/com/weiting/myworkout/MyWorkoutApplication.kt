package com.weiting.myworkout

import android.app.Application

class MyWorkoutApplication: Application() {

    lateinit var application: Application

    override fun onCreate() {
        super.onCreate()
        application = this

    }

}