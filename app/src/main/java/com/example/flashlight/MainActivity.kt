package com.example.flashlight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebHistoryItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btWhite.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("color","white")
            startActivity(intent)
        }
        btBlue.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("color","blue")
            startActivity(intent)
        }
        btCyan.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("color","cyan")
            startActivity(intent)
        }
        btGreen.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("color","green")
            startActivity(intent)
        }
        btMagenta.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("color","magenta")
            startActivity(intent)
        }
        btRed.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("color","red")
            startActivity(intent)
        }
        btLightGrey.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("color","light grey")
            startActivity(intent)
        }
    }
}