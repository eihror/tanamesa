package com.eihror.tanamesa.extensions

import android.view.View
import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.Locale

fun View.updatePadding(
  left: Int = paddingLeft,
  top: Int = paddingTop,
  right: Int = paddingRight,
  bottom: Int = paddingBottom
) {
  setPadding(left, top, right, bottom)
}

fun View.click(listener: (View) -> Unit) {
  setOnClickListener(listener)
}




      fun BigDecimal.formatForCurrency(locale: Locale): String {
        val currencyFormat = DecimalFormat.getCurrencyInstance(locale)
        return currencyFormat.format(this)
      }