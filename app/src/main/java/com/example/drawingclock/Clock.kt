package com.example.drawingclock

import android.content.Context
import android.graphics.*
import android.view.View
import java.util.*

class Clock(context: Context) : View(context) {

    val bitmap = Bitmap.createBitmap(1400, 2000, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(bitmap)
    val paint = Paint()
    val xCenter = canvas.width.toFloat() / 2
    val yCenter = canvas.height.toFloat() / 2

    override fun onDraw(canvas: Canvas) {

        canvas.drawColor(Color.YELLOW)

        drawCircle(canvas)
        drawCenter(canvas)
        drawLineHour(canvas)
        drawLineMinute(canvas)
        drawLineSecond(canvas)

        postInvalidateDelayed(1000)
        invalidate()
    }

    fun drawCircle(canvas: Canvas) {

        paint.color = Color.LTGRAY
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 40F
        canvas.drawCircle(xCenter, yCenter, 370f, paint)

    }

    fun drawCenter(canvas: Canvas) {

        paint.color = Color.BLACK
        paint.style = Paint.Style.STROKE
        canvas.drawCircle(xCenter, yCenter, 37f, paint)

    }


    fun drawLineHour(canvas: Canvas) {

        paint.color = Color.GREEN
        paint.style = Paint.Style.FILL
        paint.strokeWidth = 50F
        paint.isAntiAlias = true
        canvas.drawLine(
            xCenter,
            yCenter,
            xCenter,
            yCenter - 250,
            paint
        )

    }

    fun drawLineMinute(canvas: Canvas) {

        paint.color = Color.MAGENTA
        paint.style = Paint.Style.FILL
        paint.strokeWidth = 37F
        paint.isAntiAlias = true
        canvas.drawLine(
            xCenter,
            yCenter,
            xCenter,
            yCenter - 250,
            paint
        )
    }

    fun drawLineSecond(canvas: Canvas) {

        paint.color = Color.CYAN
        paint.style = Paint.Style.FILL
        paint.strokeWidth = 14F
        paint.isAntiAlias = true
        //  val offset = 20
//        matrix.reset()
//        matrix.setRotate(30f,xCenter,xCenter)
        canvas.drawLine(
            xCenter,
            yCenter,
            xCenter,
            yCenter - 250,
            paint
        )

    }
}


