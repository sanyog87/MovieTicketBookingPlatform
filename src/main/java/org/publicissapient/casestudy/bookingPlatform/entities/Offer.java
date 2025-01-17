package org.publicissapient.casestudy.bookingPlatform.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "offers")
public class Offer {

    @Id
    private String offerCode;
    private List<Theatre> theatresoffer = new ArrayList<>();

}
