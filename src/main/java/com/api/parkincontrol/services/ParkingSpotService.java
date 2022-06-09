package com.api.parkincontrol.services;


import com.api.parkincontrol.models.ParkingSpotModel;
import com.api.parkincontrol.repositories.ParkingSpotRepository;


import org.springframework.stereotype.Service;


import javax.transaction.Transactional;


@Service
public class ParkingSpotService {


    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }



    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }
}
