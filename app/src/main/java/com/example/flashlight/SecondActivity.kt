package com.example.flashlight

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val color = intent.getStringExtra("color")
        if (color.equals("red"))clSecond.setBackgroundColor(Color.RED)
        else if (color.equals("green"))clSecond.setBackgroundColor(Color.GREEN)
        else if (color.equals("blue"))clSecond.setBackgroundColor(Color.BLUE)
        else if (color.equals("cyan"))clSecond.setBackgroundColor(Color.CYAN)
        else if (color.equals("light grey"))clSecond.setBackgroundColor(Color.LTGRAY)
        else if (color.equals("magenta"))clSecond.setBackgroundColor(Color.MAGENTA)
        else clSecond.setBackgroundColor(Color.WHITE)

    }
}