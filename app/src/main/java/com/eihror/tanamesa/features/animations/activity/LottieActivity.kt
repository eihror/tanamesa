package com.eihror.tanamesa.features.animations.activity

import android.content.Intent
import android.os.Bundle
import com.eihror.tanamesa.R
import com.eihror.tanamesa.TNMApplication
import com.eihror.tanamesa.base.BaseActivity

class LottieActivity : BaseActivity() {

  companion object {
    fun newIntent(): Intent = Intent(TNMApplication.instance, LottieActivity::class.java)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_lottie)
  }

}