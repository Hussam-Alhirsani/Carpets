package com.example.carpets.data

import com.example.carpets.R
import com.example.carpets.model.Carpet

class DataSource {

    fun loadcarpet () : List<Carpet> {

        // return list of data

        return listOf(

            Carpet(R.string.detailsProduct1 , R.drawable.image1 , R.string.price1),
            Carpet(R.string.detailsProduct2 , R.drawable.image2 , R.string.price2),
            Carpet(R.string.detailsProduct3 , R.drawable.image3 , R.string.price3),
            Carpet(R.string.detailsProduct4 , R.drawable.image4 , R.string.price4),
            Carpet(R.string.detailsProduct5 , R.drawable.image5 , R.string.price5),
            Carpet(R.string.detailsProduct6 , R.drawable.image6 , R.string.price6),
            Carpet(R.string.detailsProduct7 , R.drawable.image7 , R.string.price7),
            Carpet(R.string.detailsProduct8 , R.drawable.image8 , R.string.price8)

        )
    }
}