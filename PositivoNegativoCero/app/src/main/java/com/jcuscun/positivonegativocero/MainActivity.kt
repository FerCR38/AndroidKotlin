package com.jcuscun.positivonegativocero

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // aplica diseño edge-to-edge :contentReference[oaicite:5]{index=5}
        setContentView(R.layout.activity_main)

        val etNumber = findViewById<EditText>(R.id.etNumber)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnSubmit.setOnClickListener {
            val numero = etNumber.text.toString().toIntOrNull()
            if (numero != null) {
                txtResult.text = numero.toString()

                when {
                    numero == 0 -> txtResult.setTextColor(Color.BLUE)
                    numero > 0  -> txtResult.setTextColor(Color.GREEN)
                    else        -> txtResult.setTextColor(Color.RED)
                }
            } else {
                Toast.makeText(this, "Ingresa un número válido", Toast.LENGTH_SHORT).show()
            }
        }

        // Ajustar paddings de sistema invisible bajo status/navigation bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val sys = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(sys.left, sys.top, sys.right, sys.bottom)
            insets
        }
    }
}