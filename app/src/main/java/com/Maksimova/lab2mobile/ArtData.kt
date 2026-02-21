package com.Maksimova.lab2mobile

import com.Maksimova.lab2mobile.R

object ArtData {
    val artworks = listOf(
        Artwork(
            imageResId = R.drawable.art_venice,
            titleResId = R.string.art_venice_title,
            artistResId = R.string.art_venice_artist,
            yearResId = R.string.art_venice_year
        ),
        Artwork(
            imageResId = R.drawable.art_italy,
            titleResId = R.string.art_italy_title,
            artistResId = R.string.art_italy_artist,
            yearResId = R.string.art_italy_year
        ),
        Artwork(
            imageResId = R.drawable.art_gondola,
            titleResId = R.string.art_gondola_title,
            artistResId = R.string.art_gondola_artist,
            yearResId = R.string.art_gondola_year
        )
    )
}