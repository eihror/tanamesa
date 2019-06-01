package com.eihror.tanamesa.features.extensions.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.eihror.tanamesa.R
import com.eihror.tanamesa.TNMApplication
import com.eihror.tanamesa.base.BaseActivity
import com.eihror.tanamesa.extensions.formatForCurrency
import kotlinx.android.synthetic.main.activity_extensions.text_view_brcurrency
import kotlinx.android.synthetic.main.activity_extensions.text_view_encurrency
import kotlinx.android.synthetic.main.activity_extensions.text_view_cycurrency
import java.math.BigDecimal
import java.util.Locale

class CurrencyActivity : BaseActivity() {

  companion object {
    fun newIntent(): Intent = Intent(TNMApplication.instance, CurrencyActivity::class.java)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_extensions)

    val bigDecimal = BigDecimal("2150.99")

    text_view_encurrency.text = bigDecimal.formatForCurrency(Locale("en", "US"))
    text_view_brcurrency.text = bigDecimal.formatForCurrency(Locale("pt", "BR"))
    text_view_cycurrency.text = bigDecimal.formatForCurrency(Locale("cy", "GB"))


    text_view_encurrency.setOnClickListener {
      Toast.makeText(applicationContext, "${text_view_encurrency.text}", Toast.LENGTH_LONG)
          .show()
    }

    text_view_brcurrency.setOnClickListener {
      Toast.makeText(applicationContext, "${text_view_brcurrency.text}", Toast.LENGTH_LONG)
          .show()
    }

    text_view_cycurrency.setOnClickListener {
      Toast.makeText(applicationContext, "${text_view_cycurrency.text}", Toast.LENGTH_LONG)
          .show()
    }

  }

}
