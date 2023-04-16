package com.example.london_tube_map_free

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.util.FitPolicy


class MainActivity : AppCompatActivity() {
    private var pdfView: PDFView? = null

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
            .load()
    }
}