package com.aniket.uber.uberApp.strategies.Impl;

import com.aniket.uber.uberApp.dto.RideRequestDto;
import com.aniket.uber.uberApp.strategies.RideFairCalculationStrategy;

public class RideFareDefaultFareCalculationStrategy implements RideFairCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
