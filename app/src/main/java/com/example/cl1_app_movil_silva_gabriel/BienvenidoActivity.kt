package com.example.cl1_app_movil_silva_gabriel

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class BienvenidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)

        val btnSalir = findViewById<Button>(R.id.buttonSalir);

        btnSalir.setOnClickListener{
            val title_alert: String = "ALERTA !"
            val mensage_alert: String = "¿Esta seguro que desea abandonar la aplicación?"
            showModalConfirmExit(title_alert, mensage_alert);

        }
    }
    private fun showModalConfirmExit(title_alert: String, mensage_alert: String){
        val dialogConfirm = Dialog(this)
        dialogConfirm.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogConfirm.setCancelable(false)
        dialogConfirm.setContentView(R.layout.custom_modal_dialog)
        dialogConfirm.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val titulo: TextView = dialogConfirm.findViewById(R.id.text_title)
        val mensage: TextView = dialogConfirm.findViewById(R.id.text_message)
        val btn_si: Button =dialogConfirm.findViewById(R.id.btnSi)
        val btn_no: Button =dialogConfirm.findViewById(R.id.btnNo)

        titulo.text = title_alert
        mensage.text = mensage_alert

        btn_si.setOnClickListener{
            val menuPrincipal = Intent(this, MenuPrincipal:: class.java)
            startActivity(menuPrincipal)
        }

        btn_no.setOnClickListener{
            Toast.makeText(this, "El usuario se mantendra conectado", Toast.LENGTH_LONG).show();
            dialogConfirm.dismiss()
        }

        dialogConfirm.show();

    }
}