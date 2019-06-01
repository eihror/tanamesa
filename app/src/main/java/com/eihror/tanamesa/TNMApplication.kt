package com.eihror.tanamesa

import android.app.Activity
import android.app.Application
import android.os.Bundle

class TNMApplication : Application(), Application.ActivityLifecycleCallbacks {

  companion object {
    lateinit var instance: TNMApplication
    var TAG = "TNMApplication"
  }

  init {
    instance = this
  }

  override fun onActivityPaused(activity: Activity?) {}

  override fun onActivityResumed(activity: Activity?) {}

  override fun onActivityStarted(activity: Activity?) {}

  override fun onActivityDestroyed(activity: Activity?) {}

  override fun onActivitySaveInstanceState(
    activity: Activity?,
    outState: Bundle?
  ) {}

  override fun onActivityStopped(activity: Activity?) {}

  override fun onActivityCreated(
    activity: Activity?,
    savedInstanceState: Bundle?
  ) {}

}