package com.api.parkincontrol.services;

import com.api.parkincontrol.repositories.ParkingSpotRepository;

import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {


    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
}
