package com.orobator.koroutines

import android.app.Application
import timber.log.Timber
import timber.log.Timber.DebugTree

class KoroutineApp : Application() {

  override fun onCreate() {
    super.onCreate()

    Timber.plant(DebugTree())
  }
}