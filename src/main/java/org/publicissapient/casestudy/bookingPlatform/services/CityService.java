package org.publicissapient.casestudy.bookingPlatform.services;

import org.bson.types.ObjectId;
import org.publicissapient.casestudy.bookingPlatform.entities.City;
import org.publicissapient.casestudy.bookingPlatform.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CityService {
    @Autowired
    private CityRepository cityRepository;


    public void saveCityEntry(City city) {
        cityRepository.save(city);

    }

    public City getCity(String cityName) {
        return cityRepository.findByCityName(cityName);
    }
}
