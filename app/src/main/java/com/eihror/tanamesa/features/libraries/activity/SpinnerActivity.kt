package com.eihror.tanamesa.features.libraries.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.eihror.tanamesa.R
import com.eihror.tanamesa.TNMApplication
import com.eihror.tanamesa.base.BaseActivity
import com.eihror.tanamesa.extensions.createAdapter
import com.eihror.tanamesa.model.User
import kotlinx.android.synthetic.main.activity_spinner.spinner_custom
import kotlinx.android.synthetic.main.activity_spinner.spinner_normal

class SpinnerActivity : BaseActivity() {

  companion object {
    fun newIntent(): Intent = Intent(TNMApplication.instance, SpinnerActivity::class.java)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_spinner)

    val usersList: List<String> =
      listOf("Select an user", "User 1", "User 2", "User 3", "User 4", "User 5", "User 6")
    spinner_custom.setList(usersList)

    spinner_custom.setItemSelected {
      Toast.makeText(this, usersList[it] + " selected!", Toast.LENGTH_SHORT)
          .show()
    }

    val users = ArrayList<User>()
    users.add(User(id = -1, name = "Select an user"))
    users.add(User(id = 1, name = "User 1"))
    users.add(User(id = 2, name = "User 2"))
    users.add(User(id = 3, name = "User 3"))
    users.add(User(id = 4, name = "User 4"))
    users.add(User(id = 5, name = "User 5"))
    users.add(User(id = 6, name = "User 6"))

    spinner_normal.createAdapter(
        R.layout.item_spinner,
        R.layout.item_spinner_dropdown,
        users,
        {
          Toast.makeText(this, users[it].toString() + " selected!", Toast.LENGTH_SHORT)
              .show()
        },
        { }
    )

  }

}