package com.eihror.tanamesa.features.animations.activity

import android.content.Intent
import android.graphics.drawable.Animatable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eihror.tanamesa.R
import com.eihror.tanamesa.TNMApplication
import com.eihror.tanamesa.base.BaseActivity
import kotlinx.android.synthetic.main.activity_without_lottie.image

class WLottieActivity : BaseActivity() {

    companion object {
        fun newIntent(): Intent = Intent(TNMApplication.instance, WLottieActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_without_lottie)

        val animatable = image.drawable as Animatable
        animatable.start()
    }

}