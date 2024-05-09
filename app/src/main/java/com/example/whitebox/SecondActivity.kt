package com.example.whitebox

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.ContactsContract.Contacts
import android.provider.MediaStore
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.TextViewCompat
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_second)

        val cardbtn1 = findViewById<CardView>(R.id.cd1)
        val cardbtn2 = findViewById<CardView>(R.id.cd2)
        val cardbtn3 = findViewById<CardView>(R.id.cd3)
        val cardbtn4 = findViewById<CardView>(R.id.cd4)


        val txt = intent.getStringExtra(EnterDetails.KEY)

       findViewById<TextView>(R.id.txt).apply{
           text = "Welcome $txt"
       }

        cardbtn1.setOnClickListener {
          val link : Uri = Uri.parse("https://www.youtube.com")
            val intent = Intent(Intent.ACTION_VIEW,link )

            startActivity(intent)
        }
        cardbtn2.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        cardbtn3.setOnClickListener {
val link : Uri = Uri.parse("https://www.linkedin.com/")
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)

        }

        cardbtn4.setOnClickListener {
val intent = Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }


















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}