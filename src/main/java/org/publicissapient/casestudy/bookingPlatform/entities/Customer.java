package org.publicissapient.casestudy.bookingPlatform.entities;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "customers")
public class Customer {

    @Id
    private ObjectId custId;

    @NonNull
    private String userId;
    private String pwd;
    private String fullName;
    private int age;
    private String gender; //Male or Female //Not Adding Validations

    private String mailId;
    private String contactNo;
    private String city;

}
