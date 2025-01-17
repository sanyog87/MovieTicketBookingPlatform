package org.publicissapient.casestudy.bookingPlatform.repository;

import org.bson.types.ObjectId;
import org.publicissapient.casestudy.bookingPlatform.entities.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, ObjectId> {


}
