package org.publicissapient.casestudy.bookingPlatform.services;

import org.publicissapient.casestudy.bookingPlatform.entities.Offer;
import org.publicissapient.casestudy.bookingPlatform.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OfferService {
    @Autowired
    private OfferRepository offerRepository;

    public void createOffer(Offer offer) {
        offerRepository.save(offer);
    }
}
