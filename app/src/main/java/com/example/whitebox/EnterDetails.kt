package com.example.whitebox

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat




class EnterDetails : AppCompatActivity() {
    companion object{
         const val KEY = "package com.example.whitebox.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_enter_details)

        val edtname = findViewById<EditText>(R.id.edtName)
        val btn = findViewById<Button>(R.id.btnSub)





        btn.setOnClickListener{
            val name  = edtname.text.toString()
            intent = Intent(this , SecondActivity::class.java)
            intent.putExtra(KEY , name)
            startActivity(intent)
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}