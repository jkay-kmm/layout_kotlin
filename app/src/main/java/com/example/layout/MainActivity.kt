package com.example.layout
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.layout.databinding.ActivityMainBinding
private  lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var customAdapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // khai bao danh sach các item
        var list = mutableListOf<OutData>()
        list.add(OutData(R.drawable.hinh1, "Tiêu đề 1", "Mô tả 1"))
        list.add(OutData(R.drawable.hinh2, "Tiêu đề 2", "Mô tả 2"))
        list.add(OutData(R.drawable.hinh3, "Tiêu đề 3", "Mô tả 3"))
        list.add(OutData(R.drawable.hinh4, "Tiêu đề 4", "Mô tả 4"))
        list.add(OutData(R.drawable.hinh5, "Tiêu đề 5", "Mô tả 5"))
        list.add(OutData(R.drawable.hinh1, "Tiêu đề 1", "Mô tả 1"))
        list.add(OutData(R.drawable.hinh2, "Tiêu đề 2", "Mô tả 2"))
        list.add(OutData(R.drawable.hinh3, "Tiêu đề 3", "Mô tả 3"))
        list.add(OutData(R.drawable.hinh4, "Tiêu đề 4", "Mô tả 4"))
        list.add(OutData(R.drawable.hinh5, "Tiêu đề 5", "Mô tả 5"))
        list.add(OutData(R.drawable.hinh1, "Tiêu đề 1", "Mô tả 1"))
        list.add(OutData(R.drawable.hinh2, "Tiêu đề 2", "Mô tả 2"))
        list.add(OutData(R.drawable.hinh3, "Tiêu đề 3", "Mô tả 3"))
        list.add(OutData(R.drawable.hinh4, "Tiêu đề 4", "Mô tả 4"))
        list.add(OutData(R.drawable.hinh5, "Tiêu đề 5", "Mô tả 5"))

        customAdapter = CustomAdapter(this, list)
        val lvPhim = findViewById<ListView>(R.id.lvPhim)
        lvPhim.adapter = customAdapter
        lvPhim.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Bạn chọn: " + list[position].title, Toast.LENGTH_SHORT).show()
        }


    }

}