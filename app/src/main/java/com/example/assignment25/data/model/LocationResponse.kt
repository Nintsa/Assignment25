package com.example.assignment25.data.model

import com.squareup.moshi.Json

data class LocationResponse(
    @Json(name = "latitude") val latitude: Double,
    @Json(name = "longitude") val longitude: Double
)
