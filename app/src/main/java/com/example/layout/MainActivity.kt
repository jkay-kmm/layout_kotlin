package com.example.layout
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log.i
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.layout.databinding.ActivityMainBinding
import kotlin.jvm.java


private  lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ds = mutableListOf<OutData_Recycler>()
        ds.add(OutData_Recycler(R.drawable.hinh1, "Tên Phim, Lượt Xem", "Mô tả"))
        ds.add(OutData_Recycler(R.drawable.hinh2, "Tên Phim, Lượt Xem", "Mô tả"))
        ds.add(OutData_Recycler(R.drawable.hinh3, "Tên Phim, Lượt Xem", "Mô tả"))

        val adapter = RvAdapter(ds)
        binding.rvDemo.adapter = adapter
        binding.rvDemo.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)






    }
}