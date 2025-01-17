package org.publicissapient.casestudy.bookingPlatform.controllers;

import org.publicissapient.casestudy.bookingPlatform.entities.Offer;
import org.publicissapient.casestudy.bookingPlatform.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/offers")
public class OfferController {
    @Autowired
    private OfferService offerService;

    @RequestMapping("/create_new_offer")
    public ResponseEntity<?> createOffer(Offer offer) {
        try {
            offerService.createOffer(offer);
            return new ResponseEntity<>(offer, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>("Kindly give sufficient details for the offer", HttpStatus.BAD_REQUEST);
        }
    }

}
