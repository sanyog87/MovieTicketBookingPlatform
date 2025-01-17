package org.publicissapient.casestudy.bookingPlatform.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "movies")
public class Movie {

    @Id
    private ObjectId movieId;
    @NonNull
    private String movieName;
    private LocalDate movieReleaseDate= LocalDate.now();
    private List<City> cities = new ArrayList<>();
    private List<Theatre> movieReleaseTheatres = new ArrayList<>();
}
