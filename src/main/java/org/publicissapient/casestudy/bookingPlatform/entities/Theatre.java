package org.publicissapient.casestudy.bookingPlatform.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@Document(collection = "theatres")
public class Theatre {
    @Id
    private long theatreId;
    @NonNull
    private String theatreName;
    private Movie movie;
    private int screens=1;
    private int seatingCapacity=0;
    private LocalDate showDate=LocalDate.now();
    private Map<String,Integer> remainingSeatsOfShow = new HashMap<>();
}
