package com.example.layout
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.layout.databinding.ActivityMainBinding
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {

   lateinit var adapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // khai bao danh sach cac item list
        val list = mutableListOf<OutData>()
        list.add(OutData(R.drawable.hinh3, "Tiêu đề 1", "mô tả 1"))
        list.add(OutData(R.drawable.hinh4, "Tiêu đề 2", "mô tả 2"))
        list.add(OutData(R.drawable.hinh5, "Tiêu đề 3", "mô tả 3"))
        list.add(OutData(R.drawable.hinh3, "Tiêu đề 1", "mô tả 1"))
        list.add(OutData(R.drawable.hinh4, "Tiêu đề 2", "mô tả 2"))
        list.add(OutData(R.drawable.hinh5, "Tiêu đề 3", "mô tả 3"))
        list.add(OutData(R.drawable.hinh3, "Tiêu đề 1", "mô tả 1"))
        list.add(OutData(R.drawable.hinh4, "Tiêu đề 2", "mô tả 2"))
        list.add(OutData(R.drawable.hinh5, "Tiêu đề 3", "mô tả 3"))
        adapter = CustomAdapter(this, list)
        // khai bao để lk toi lvPhim
        val lvPhim = findViewById<ListView>(R.id.lvPhim)
        lvPhim.adapter = adapter
        lvPhim.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "Bạn chọn: " + list[position].txt1, Toast.LENGTH_LONG).show()
        }
    }

}