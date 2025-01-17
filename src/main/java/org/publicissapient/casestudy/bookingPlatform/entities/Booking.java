package org.publicissapient.casestudy.bookingPlatform.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "bookings")
public class Booking {

    private String bookingId;
    private Theatre theatre;
    private int remainingSeats;
    private String showTime; //Morning Matinee Night

}
