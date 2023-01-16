package com.itpln.recyclerview


object FoodsData {
    private val birdNames = arrayOf(
        "Beo",
        "Cendrawasih",
        "Gelatik",
        "Kenari",
        "kolibri",
        "Pipit",
        "Pleci",
        "Prenjak"

    )


    private val birdImages = intArrayOf(
        R.drawable.beo,
        R.drawable.cendrawasih,
        R.drawable.gelatik,
        R.drawable.kenari,
        R.drawable.kolibri,
        R.drawable.pipit,
        R.drawable.pleci,
        R.drawable.prenjak

    )

    val listData: ArrayList<Foods>
        get() {
            val list = arrayListOf<Foods>()
            for (position in birdNames.indices) {
                val foods = Foods()
                foods.name = birdNames[position]
                foods.photo = birdImages[position]
                list.add(foods)
            }
            return list
        }
}