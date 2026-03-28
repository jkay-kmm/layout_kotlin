package com.example.layout
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.layout.databinding.ActivityMainBinding


private  lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // khai bao danh sach
        val list = resources.getStringArray(R.array.arrQuocGia)
        var adt = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)
        binding.autoTinhThanh.setAdapter(adt)

        // set goi y voi 0 ký tự nhập vào

    }
}