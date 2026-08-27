package com.example.countapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.countapp.databinding.ActivityMainBinding

//variable untuk binding
private lateinit var binding: ActivityMainBinding
var counter = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //inisiasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        //set content dari activity
        setContentView(binding.root)

        //akses view element
        with(receiver = binding) {
            //akses ui by id
            tvNumber.text = counter.toString()

            //ketika button click
            btnCount.setOnClickListener {
                counter++
                tvNumber.text = counter.toString()
            }

            //ketika button toast
            btnToast.setOnClickListener {
                Toast
                    .makeText(
                        this@MainActivity,
                        "Counter : $counter",
                        Toast.LENGTH_SHORT
                    )
                    .show()
            }
        }
    }
}