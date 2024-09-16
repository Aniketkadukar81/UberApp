package com.aniket.uber.uberApp.services;

import com.aniket.uber.uberApp.dto.DriverDto;
import com.aniket.uber.uberApp.dto.RideDto;
import com.aniket.uber.uberApp.dto.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RideDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();

}
