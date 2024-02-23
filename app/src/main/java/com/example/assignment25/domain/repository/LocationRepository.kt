package com.example.assignment25.domain.repository

import com.example.assignment25.domain.model.Location

interface LocationRepository {
    suspend fun getDeviceLocation(): Location
    suspend fun searchLocation(query: String): Location
}