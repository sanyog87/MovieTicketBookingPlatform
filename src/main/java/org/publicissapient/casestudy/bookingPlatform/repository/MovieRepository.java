package org.publicissapient.casestudy.bookingPlatform.repository;

import org.bson.types.ObjectId;
import org.publicissapient.casestudy.bookingPlatform.entities.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
   public Movie findByMovieName(String movieName);
}
