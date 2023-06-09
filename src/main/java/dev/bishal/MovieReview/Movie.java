package dev.bishal.MovieReview;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

//this class represents each document in the movies collection in mongodb

@Document(collection = "movies")
@Data
@AllArgsConstructor //constructors that take all the private fields as arguments
@NoArgsConstructor
public class Movie {
    //this property is used to identify the unique document in the collection
    @Id
    private Object id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    //each movie has an array of Reviews
    //one-to-many: one many relationship

    //since we have springboot we can do this:

    @DocumentReference
    private List<Review> reviewsIds;

}
