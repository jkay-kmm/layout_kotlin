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
        binding.btnSoThich.setOnClickListener {
            xuLyChonSoThich()
        }
    }

    private fun xuLyChonSoThich() {
       var strSoThich = ""
        if (binding.cbNgheNhac.isChecked)
            strSoThich += binding.cbNgheNhac.text.toString() + "\n"
        if (binding.CbXemPhim.isChecked)
            strSoThich += binding.CbXemPhim.text.toString() + "\n"
        if (binding.cbBongDa.isChecked)
            strSoThich += binding.cbBongDa.text.toString() + "\n"
        if (binding.cbChoiCau.isChecked)
            strSoThich += binding.cbChoiCau.text.toString() + "\n"
        binding.edtSothich.setText(strSoThich)
    }
}