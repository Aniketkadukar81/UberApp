package com.aniket.uber.uberApp.strategies;

import com.aniket.uber.uberApp.dto.RideRequestDto;

public interface RideFairCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);
}
