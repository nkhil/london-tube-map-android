package com.example.london_tube_map_free

import android.os.Bundle
//import android.view.MotionEvent
//import android.view.ScaleGestureDetector
//import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.util.FitPolicy

//import kotlin.math.min


class MainActivity : AppCompatActivity() {
    private var pdfView: PDFView? = null
//    private var scaleGestureDetector: ScaleGestureDetector? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide();
        setContentView(R.layout.activity_main)
        pdfView = findViewById(R.id.pdfView)

        displayFromAsset("london-tube-map.pdf");
    }

    private fun displayFromAsset(assetFileName: String) {
        pdfView!!.fromAsset(assetFileName)
            .defaultPage(0)
            .enableDoubletap(true)
            .pageFitPolicy(FitPolicy.HEIGHT)
//            .enableSwipe(true)
//            .onPageChange(null)
            .load()
    }

//    override fun onTouchEvent(event: MotionEvent?): Boolean {
//        scaleGestureDetector!!.onTouchEvent(event!!)
//        return true
//    }

//    private class ScaleListener : SimpleOnScaleGestureListener() {
//        override fun onScale(detector: ScaleGestureDetector): Boolean {
//            mScaleFactor *= detector.scaleFactor
//            mScaleFactor = 0.1f.coerceAtLeast(min(mScaleFactor, 10.0f))
//            pdfView.setScaleX(mScaleFactor)
//            pdfView.setScaleY(mScaleFactor)
//            return true
//        }
//    }
}