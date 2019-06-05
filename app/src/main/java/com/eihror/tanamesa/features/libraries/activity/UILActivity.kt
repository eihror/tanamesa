package com.eihror.tanamesa.features.libraries.activity

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import com.eihror.tanamesa.R
import com.eihror.tanamesa.TNMApplication
import com.eihror.tanamesa.base.BaseActivity
import com.eihror.tanamesa.utils.ImageUtil
import com.eihror.tanamesa.utils.ImageUtil.DisplayerConfig
import kotlinx.android.synthetic.main.activity_uil.image_one
import kotlinx.android.synthetic.main.activity_uil.image_two

class UILActivity : BaseActivity() {

  private var imageUtil = ImageUtil()

  companion object {
    fun newIntent(): Intent = Intent(TNMApplication.instance, UILActivity::class.java)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_uil)

    imageUtil.initImageLoader(applicationContext)

    imageUtil.setData(
        imageOnLoading = R.drawable.ic_time,
        imageForEmptyUri = R.drawable.ic_erro,
        imageOnFail = R.drawable.ic_fail
    )

    imageUtil.loadImage(
        imageUrl = "https://free4kwallpapers.com/uploads/originals/2019/04/16/futuristic-city-wallpaper.jpg",
        imageView = image_one,
        isCircularDisplayer = false,
        displayerConfig = null
    )

    imageUtil.loadImage(
        imageUrl = "https://static.quizur.com/i/b/5b5a275ed85d16.952723135b5a275ec94bf4.02056781.jpg",
        imageView = image_two,
        isCircularDisplayer = true,
        displayerConfig = DisplayerConfig(Color.BLACK, 16f)
    )

  }

  override fun onStop() {
    super.onStop()
    imageUtil.onClearUIL()
  }

}