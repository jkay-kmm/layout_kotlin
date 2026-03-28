package com.example.layout
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
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
       setupCustomSpiner()

    }

    private fun setupCustomSpiner() {
        var list = mutableListOf<OutData>()
        list.add(OutData(R.drawable.hinh1, "Món ăn 1"))
        list.add(OutData(R.drawable.hinh2, "Món ăn 2"))
        list.add(OutData(R.drawable.hinh3, "Món ăn 3"))
        list.add(OutData(R.drawable.hinh4, "Món ăn 4"))
        list.add(OutData(R.drawable.hinh5, "Món ăn 5"))
        val customspinner = CustomSpriner(this, list)
        binding.spCustom.adapter = customspinner
        binding.spCustom.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                p0: AdapterView<*>?,
                p1: View?,
                p2: Int,
                p3: Long
            ) {
                Toast.makeText(this@MainActivity, list[p2].txt, Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }

}