package com.roam.roamsdkexample

import android.app.Application
import android.util.Log
import com.roam.sdk.Roam

class BaseApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        // TODO: Step 1 : Toggle events
        Roam.initialize(this,"YOUR-PUBLISH-KEY")


    }
}