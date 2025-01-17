package org.publicissapient.casestudy.bookingPlatform.repository;

import org.bson.types.ObjectId;
import org.publicissapient.casestudy.bookingPlatform.entities.Theatre;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepository extends MongoRepository<Theatre, ObjectId> {
    public Theatre findByTheatreName(String theatreName);
}
