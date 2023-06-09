package dev.bishal.MovieReview;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>{
    //we don't want to search by Object Id, we want to search by the ImdB id
    Optional<Movie> findMovieByImdbId(String imdbId);


}
