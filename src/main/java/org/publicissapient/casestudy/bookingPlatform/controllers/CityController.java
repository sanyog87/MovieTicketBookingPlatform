package org.publicissapient.casestudy.bookingPlatform.controllers;

import org.publicissapient.casestudy.bookingPlatform.entities.City;
import org.publicissapient.casestudy.bookingPlatform.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;


    @PostMapping("/save_new_city")
    public ResponseEntity<?> saveCity(@RequestBody City city){
        try {
            cityService.saveCityEntry(city);
            return  new ResponseEntity<>(city, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("City Save Failed", HttpStatus.BAD_REQUEST);
        }

    }

}
