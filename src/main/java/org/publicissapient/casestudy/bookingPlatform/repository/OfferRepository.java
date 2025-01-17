package org.publicissapient.casestudy.bookingPlatform.repository;

import org.bson.types.ObjectId;
import org.publicissapient.casestudy.bookingPlatform.entities.Offer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends MongoRepository<Offer, ObjectId> {
}
