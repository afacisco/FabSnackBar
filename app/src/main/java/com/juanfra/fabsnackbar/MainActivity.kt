package com.juanfra.fabsnackbar

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

/*
Autor: Juan Francisco Sánchez González
Fecha: 03/11/2024
Clase: Actividad que contiene un FloatingActionButton. Al pulsarlo se muestra un Snackbar.
*/

class MainActivity : AppCompatActivity() {

    lateinit var fab: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Se instancia el FloatingActionButton y se le agrega el listener
        fab = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            // Mostrar Snackbar
            val snack = Snackbar.make(view, getString(R.string.sb_men_text), Snackbar.LENGTH_LONG)
                .setTextColor(getColor(R.color.blue_ligth))
                .setActionTextColor(Color.GREEN)
                .setAction(getString(R.string.sb_btn_text)) {
                    // Código para realizar
                }
                .show()
        }
    }
}