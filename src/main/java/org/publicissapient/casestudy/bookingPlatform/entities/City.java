package org.publicissapient.casestudy.bookingPlatform.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "cities")
public class City {

    @Id
    private ObjectId cityId;
    @NonNull
    private String cityName;
    private String country;
    private List<Theatre> theatresInCity = new ArrayList<>();

}
