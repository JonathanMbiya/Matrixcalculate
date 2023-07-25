package com.example.matrixcalculte3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCalculate = findViewById<Button>(R.id.buttonCalculate)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        buttonCalculate.setOnClickListener {
            // Récupérer les valeurs des matrices A et B
            val matrixA11 = findViewById<EditText>(R.id.editTextMatrixA11).text.toString().toInt()
            val matrixA12 = findViewById<EditText>(R.id.editTextMatrixA12).text.toString().toInt()
            val matrixA21 = findViewById<EditText>(R.id.editTextMatrixA21).text.toString().toInt()
            val matrixA22 = findViewById<EditText>(R.id.editTextMatrixA22).text.toString().toInt()

            val matrixB11 = findViewById<EditText>(R.id.editTextMatrixB11).text.toString().toInt()
            val matrixB12 = findViewById<EditText>(R.id.editTextMatrixB12).text.toString().toInt()
            val matrixB21 = findViewById<EditText>(R.id.editTextMatrixB21).text.toString().toInt()
            val matrixB22 = findViewById<EditText>(R.id.editTextMatrixB22).text.toString().toInt()

            // Calculer la somme (A+B)
            val sumMatrix11 = matrixA11 + matrixB11
            val sumMatrix12 = matrixA12 + matrixB12
            val sumMatrix21 = matrixA21 + matrixB21
            val sumMatrix22 = matrixA22 + matrixB22

            // Calculer la différence (A-B)
            val diffMatrix11 = matrixA11 - matrixB11
            val diffMatrix12 = matrixA12 - matrixB12
            val diffMatrix21 = matrixA21 - matrixB21
            val diffMatrix22 = matrixA22 - matrixB22

            // Afficher les résultats
            var sumMatrix12n = ""
            var sumMatrix22nn = ""
            var diffMatrix12n = ""
            val result = "Addition (A+B):n$sumMatrix11  $sumMatrix12n$sumMatrix21  $sumMatrix22nn" +
                    "Soustraction (A-B):n$diffMatrix11  $diffMatrix12n$diffMatrix21  $diffMatrix22"
            textViewResult.text = result
        }
    }
}