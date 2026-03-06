package com.example.layout
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.layout.databinding.ActivityMainBinding
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addEvents()
    }

    private fun addEvents() {
        binding.rdHinh1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                binding.imgHinhAnh.setImageResource(R.drawable.hinh1)
            }
        }
        binding.rdHinh2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                binding.imgHinhAnh.setImageResource(R.drawable.hinh2)
            }
        }
        binding.btnThoat.setOnClickListener {
            finish()
        }
        }

}