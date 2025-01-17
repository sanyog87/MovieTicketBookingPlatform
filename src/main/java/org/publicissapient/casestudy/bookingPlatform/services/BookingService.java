package org.publicissapient.casestudy.bookingPlatform.services;

import org.publicissapient.casestudy.bookingPlatform.entities.Booking;
import org.publicissapient.casestudy.bookingPlatform.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;


    public void createBooking(Booking booking){
        bookingRepository.save(booking);
    }
}
