package com.example.layout
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.layout.databinding.ActivityMainBinding
import kotlin.jvm.java


private  lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnGo.setOnClickListener {
           val i = Intent(this, register::class.java)
//            i.putExtra("data", "Hello")
//            i.putExtra("data2", "Hello2")
//            i.putExtra("data3", true)
            val z = Bundle()
            z.putString("data", "Hello")
            z.putString("data2", "Hello2")
            z.putBoolean("data3", true)
            i.putExtras(z)


            startActivity(i)
        }
        binding.btnGo2.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(i)
        }

    }
}