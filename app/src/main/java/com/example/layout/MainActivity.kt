package com.example.layout

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val edtNhapA = findViewById<EditText>(R.id.edtNhapA)
        val edtNhapB = findViewById<EditText>(R.id.edtNhapB)
        val edtKetQua = findViewById<EditText>(R.id.edtKetQua)
        val btnCong = findViewById<Button>(R.id.btnCong)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val btnNhan = findViewById<Button>(R.id.btnNhan)
        val btnChia = findViewById<Button>(R.id.btnChia)
        val btnNhanLau = findViewById<Button>(R.id.btnNhanLau)
        val btnThoat = findViewById<Button>(R.id.btnThoat)

        btnCong.setOnClickListener {
            val a = edtNhapA.text.toString().toInt()
            val b = edtNhapB.text.toString().toInt()
            val kq = a + b
            edtKetQua.setText(kq.toString())
        }
        btnReset.setOnClickListener {
            edtNhapA.setText("")
            edtNhapB.setText("")
            edtKetQua.setText("")
            Toast.makeText(this, "Reset thành công", Toast.LENGTH_SHORT).show()
        }
        var suKienChiaSe: View.OnClickListener? = null;
        suKienChiaSe = View.OnClickListener {
            if(it == btnNhan){
                val a = edtNhapA.text.toString().toInt()
                val b = edtNhapB.text.toString().toInt()
                val kq = a * b
                edtKetQua.setText(kq.toString())
            }
            else if ( it == btnChia){
                val a = edtNhapA.text.toString().toDouble()
                val b = edtNhapB.text.toString().toDouble()
                val kq = a / b
                edtKetQua.setText(kq.toString())
            }
        }
        btnNhan.setOnClickListener(suKienChiaSe)
        btnChia.setOnClickListener(suKienChiaSe)

        var suKienNhanLau: View.OnLongClickListener? = null;
        suKienNhanLau = View.OnLongClickListener {

            Toast.makeText(this, "Nhan lau", Toast.LENGTH_SHORT).show()
        btnNhanLau.visibility = View.INVISIBLE
            true
        }
        btnNhanLau.setOnLongClickListener(suKienNhanLau)
        btnThoat.setOnClickListener {
            Toast.makeText(this, "Thoát", Toast.LENGTH_LONG).show()
            finish()
        }

    }
}