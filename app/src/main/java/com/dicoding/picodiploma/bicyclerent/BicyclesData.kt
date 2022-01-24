package com.dicoding.picodiploma.bicyclerent

object BicyclesData {

    private val bicycleNames = arrayOf("Bike 1",
        "Bike 2",
        "Bike 3",
        "Bike 4",
        "Bike 5",
        "Bike 6",
        "Bike 7",
        "Bike 8",
        "Bike 9",
        "Bike 10")


    private val bicycleCategory = arrayOf("Sport Bike",
        "Sport Bike",
        "Cargo Bike",
        "Sport Bike",
        "Cargo Bike",
        "Race Bike",
        "Sport Bike",
        "Race Bike",
        "Electronic Bike",
        "Sport Bike")


    private val biCyclePrice = arrayOf("Rp.120.000",
        "Rp.120.000",
        "Rp.100.000",
        "Rp.120.000",
        "Rp.100.000",
        "Rp.200.000",
        "Rp.120.000",
        "Rp.200.000",
        "Rp.150.000",
        "Rp.120.000",
        )


    private val bicyclesImages = intArrayOf(R.drawable.bike_1,
        R.drawable.bike_2,
        R.drawable.bike_3,
        R.drawable.bike_4,
        R.drawable.bike_5,
        R.drawable.bike_6,
        R.drawable.bike_7,
        R.drawable.bike_8,
        R.drawable.bike_9,
        R.drawable.bike_10,)

    val listData: ArrayList<Bicycle>
        get() {
            val list = arrayListOf<Bicycle>()
            for (position in bicycleNames.indices) {
                val bicycle = Bicycle()
                bicycle.name = bicycleNames[position]
                bicycle.category = bicycleCategory[position]
                bicycle.price = biCyclePrice[position]
                bicycle.photo= bicyclesImages[position]
                list.add(bicycle)
            }
            return list
        }

}