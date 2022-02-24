package com.example.drawingclock

import android.graphics.*
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val sec = Clock(this)
        setContentView(sec)

    }
}

//        val button = findViewById<Button>(R.id.button)
//        button.setOnClickListener {
//
//                paint.setColor(Color.RED)
//                paint.setStyle(Paint.Style.STROKE)
//                canvas.drawCircle(50F, 50F, 100F, paint)
//
//            }
//        }







