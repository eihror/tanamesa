package com.eihror.tanamesa.base

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

abstract class BaseActivity : AppCompatActivity() {

  var permissionListener: (Boolean) -> Unit? = {}
  var mPermissions: List<String> = ArrayList()

  fun hasPermission(vararg permissions: String): Boolean {
    for (permission in permissions) {
      if (ActivityCompat.checkSelfPermission(
              this, permission
          ) != PackageManager.PERMISSION_GRANTED
      ) {
        return false
      }
    }

    return true
  }

  fun requestPermissionsBase(
    listener: (Boolean) -> Unit,
    code: Int,
    vararg permissions: String
  ) {
    mPermissions = permissions.asList()
    permissionListener = listener

    ActivityCompat.requestPermissions(this, permissions, code)
  }

  override fun onRequestPermissionsResult(
    requestCode: Int,
    permissions: Array<out String>,
    grantResults: IntArray
  ) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults)

    permissionListener(hasPermission(*mPermissions.toTypedArray()))
    permissionListener = {}
  }

}