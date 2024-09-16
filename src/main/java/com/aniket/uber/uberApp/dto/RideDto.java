package com.aniket.uber.uberApp.dto;

import com.aniket.uber.uberApp.entities.Driver;
import com.aniket.uber.uberApp.entities.Rider;
import com.aniket.uber.uberApp.entities.enums.PaymentMethod;
import com.aniket.uber.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDto {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private LocalDateTime createdTime;
    private RiderDto rider;
    private DriverDto driver;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private Double fair;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

}