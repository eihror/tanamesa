package com.eihror.tanamesa.features.main.activity

import android.os.Bundle
import com.eihror.tanamesa.R
import com.eihror.tanamesa.base.BaseActivity
import com.eihror.tanamesa.features.animations.activity.GlideActivity
import com.eihror.tanamesa.features.animations.activity.LottieActivity
import com.eihror.tanamesa.features.animations.activity.UILActivity
import com.eihror.tanamesa.features.animations.activity.WLottieActivity
import com.eihror.tanamesa.features.extensions.activity.CurrencyActivity
import com.eihror.tanamesa.features.extensions.activity.PermissionsActivity
import kotlinx.android.synthetic.main.activity_main.button_extensions
import kotlinx.android.synthetic.main.activity_main.button_glide
import kotlinx.android.synthetic.main.activity_main.button_lottie
import kotlinx.android.synthetic.main.activity_main.button_permissions
import kotlinx.android.synthetic.main.activity_main.button_uil
import kotlinx.android.synthetic.main.activity_main.button_w_lottie

class MainActivity : BaseActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  override fun onResume() {
    super.onResume()

    button_extensions.setOnClickListener {
      startActivity(CurrencyActivity.newIntent())
    }

    button_permissions.setOnClickListener {
      startActivity(PermissionsActivity.newIntent())
    }

    button_lottie.setOnClickListener {
      startActivity(LottieActivity.newIntent())
    }

    button_w_lottie.setOnClickListener {
      startActivity(WLottieActivity.newIntent())
    }

    button_uil.setOnClickListener {
      startActivity(UILActivity.newIntent())
    }

    button_glide.setOnClickListener {
      startActivity(GlideActivity.newIntent())
    }
  }
}