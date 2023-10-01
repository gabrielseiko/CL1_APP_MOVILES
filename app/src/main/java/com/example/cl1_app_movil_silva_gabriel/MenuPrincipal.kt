package com.example.cl1_app_movil_silva_gabriel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MenuPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        val btnCrear = findViewById<Button>(R.id.buttonCrear);
        val btnCerrar = findViewById<Button>(R.id.buttonCancelar);


        btnCrear.setOnClickListener{
          val BienScreen =  Intent(this, BienvenidoActivity::class.java);
            startActivity(BienScreen)
        }

        btnCerrar.setOnClickListener({
            Toast.makeText(this, "El usuario esta intentado cancelar el registro", Toast.LENGTH_LONG).show();
        })

    }
}