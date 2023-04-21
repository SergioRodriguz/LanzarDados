package com.example.aplicaciondia1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.aplicaciondia1.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import java.util.*
import java.util.Random


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.button.setOnClickListener{
            if (binding.insertDado.text.toString().isEmpty() || binding.insertCara.text.toString().isEmpty()){

            }else{
                binding.insertDado.setText("")
                binding.insertCara.setText("")
                var numDados = binding.insertDado.text.toString().toIntOrNull()
                var numCara: Int? = binding.insertCara.text.toString().toIntOrNull()
                val diceRange = 1..numCara!!
                var i = 0
                val tirada = numDados?.let { it1 -> IntArray(it1) }
                while (i < numDados!!){

                    tirada?.set(i, diceRange.random())
                }
                binding.resultado.setText("El resultado de la tirada es: $tirada")
                Snackbar.make(it, "Boton pulsado!", Snackbar.LENGTH_SHORT).show()
            }


        }



    }



}

private fun Random.nextInt(i: Int, i1: Int) {

}



