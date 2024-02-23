package com.example.assignment25.domain.usecase

import com.example.assignment25.domain.model.Location
import com.example.assignment25.domain.repository.LocationRepository

class GetDeviceLocationUseCase(private val locationRepository: LocationRepository) {
    suspend operator fun invoke(): Location {
        return locationRepository.getDeviceLocation()
    }
}