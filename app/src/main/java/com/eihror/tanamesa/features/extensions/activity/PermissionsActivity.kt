package com.eihror.tanamesa.features.extensions.activity

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.eihror.tanamesa.R
import com.eihror.tanamesa.TNMApplication
import com.eihror.tanamesa.base.BaseActivity
import kotlinx.android.synthetic.main.activity_permissions.button_permission_camera
import kotlinx.android.synthetic.main.activity_permissions.button_permission_contact
import kotlinx.android.synthetic.main.activity_permissions.button_permission_files
import kotlinx.android.synthetic.main.activity_permissions.button_permission_location
import kotlinx.android.synthetic.main.activity_permissions.button_permission_sms

class PermissionsActivity : BaseActivity() {

  companion object {
    fun newIntent(): Intent = Intent(TNMApplication.instance, PermissionsActivity::class.java)
  }


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_permissions)
  }

  override fun onResume() {
    super.onResume()
    initView()
  }

  private fun initView() {

    button_permission_camera.setOnClickListener {
      if (!hasPermission(Manifest.permission.CAMERA)) {
        requestPermissionsBase(
            {
              if (!it) {
                Toast.makeText(
                    applicationContext, "Você não tem permissão para acessar a camera",
                    Toast.LENGTH_SHORT
                )
                    .show()
              }
            },
            1,
            Manifest.permission.CAMERA
        )
      } else {
        Toast.makeText(applicationContext, "Agora você pode usar a camera", Toast.LENGTH_SHORT)
            .show()
      }
    }

    button_permission_contact.setOnClickListener {
      if (!hasPermission(Manifest.permission.READ_CONTACTS)) {
        requestPermissionsBase(
            {
              if (!it) {
                Toast.makeText(
                    applicationContext, "Você não tem permissão para acessar os contatos",
                    Toast.LENGTH_SHORT
                )
                    .show()
              }
            },
            2,
            Manifest.permission.READ_CONTACTS
        )
      } else {
        Toast.makeText(applicationContext, "Agora você pode acessar os contatos do celular", Toast.LENGTH_SHORT)
            .show()
      }
    }

    button_permission_files.setOnClickListener {
      if (!hasPermission(
              Manifest.permission.READ_EXTERNAL_STORAGE,
              Manifest.permission.WRITE_EXTERNAL_STORAGE
          )) {
        requestPermissionsBase(
            {
              if (!it) {
                Toast.makeText(
                    applicationContext, "Você não tem permissão para acessar os arquivos",
                    Toast.LENGTH_SHORT
                )
                    .show()
              }
            },
            3,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        )
      } else {
        Toast.makeText(applicationContext, "Agora você pode acessar os arquivos do celular", Toast.LENGTH_SHORT)
            .show()
      }
    }

    button_permission_location.setOnClickListener {
      if (!hasPermission(
              Manifest.permission.ACCESS_FINE_LOCATION,
              Manifest.permission.ACCESS_COARSE_LOCATION
          )) {
        requestPermissionsBase(
            {
              if (!it) {
                Toast.makeText(
                    applicationContext, "Você não tem permissão para acessar a localização",
                    Toast.LENGTH_SHORT
                )
                    .show()
              }
            },
            4,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION
        )
      } else {
        Toast.makeText(applicationContext, "Agora você pode resgatar a localização do celular", Toast.LENGTH_SHORT)
            .show()
      }
    }

    button_permission_sms.setOnClickListener {
      if (!hasPermission(
              Manifest.permission.READ_SMS
          )) {
        requestPermissionsBase(
            {
              if (!it) {
                Toast.makeText(
                    applicationContext, "Você não tem permissão para acessar as mensagens",
                    Toast.LENGTH_SHORT
                )
                    .show()
              }
            },
            5,
            Manifest.permission.READ_SMS
        )
      } else {
        Toast.makeText(applicationContext, "Agora você pode acessar as mensagens do celular", Toast.LENGTH_SHORT)
            .show()
      }
    }


  }

}