package com.Maksimova.lab2mobile

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.Maksimova.lab2mobile.R

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var textTitle: TextView
    private lateinit var textArtist: TextView
    private lateinit var textYear: TextView
    private lateinit var buttonPrevious: Button
    private lateinit var buttonNext: Button

    private var currentIndex = 0
    private val artworks = ArtData.artworks

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        imageView = findViewById(R.id.imageView)
        textTitle = findViewById(R.id.textTitle)
        textArtist = findViewById(R.id.textArtist)
        textYear = findViewById(R.id.textYear)
        buttonPrevious = findViewById(R.id.buttonPrevious)
        buttonNext = findViewById(R.id.buttonNext)


        buttonPrevious.setOnClickListener {
            if (currentIndex > 0) {
                currentIndex--
                updateArtwork()
            }
        }

        buttonNext.setOnClickListener {
            if (currentIndex < artworks.size - 1) {
                currentIndex++
                updateArtwork()
            }
        }


        updateArtwork()
    }

    private fun updateArtwork() {
        val artwork = artworks[currentIndex]

        imageView.setImageResource(artwork.imageResId)
        imageView.contentDescription = getString(artwork.titleResId)

        textTitle.text = getString(artwork.titleResId)
        textArtist.text = getString(artwork.artistResId)
        textYear.text = getString(artwork.yearResId)

        buttonPrevious.isEnabled = currentIndex > 0
        buttonNext.isEnabled = currentIndex < artworks.size - 1
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("currentIndex", currentIndex)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        currentIndex = savedInstanceState.getInt("currentIndex")
        updateArtwork()
    }
}