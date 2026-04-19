package com.example.layout

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.layout.databinding.ActivityMainBinding
import com.example.layout.databinding.ActivityRegisterBinding

private  lateinit var binding: ActivityRegisterBinding
class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        val i = intent
        val data = i.getStringExtra("data")
        val data2 = i.getStringExtra("data2")
        val data3 = i.getBooleanExtra("data3", false)
        binding.edtIntent.setText(data)
        binding.edtIntent.setText(data2)
        binding.edtIntent.setText(data3.toString())

        val r = intent
        val bundle1 = i.extras
        if (bundle1 != null) {
            val data = bundle1.getString("data")
            val data2 = bundle1.getString("data2")
            val data3 = bundle1.getBoolean("data3")
            binding.edtIntent.setText(data)
            binding.edtIntent.setText(data2)
            binding.edtIntent.setText(data3.toString())
        }

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.BtnQuayLai.setOnClickListener {
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }
}