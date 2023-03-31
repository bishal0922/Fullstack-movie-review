package dev.bishal.MovieReview;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

//this class represents each document in the movies collection
@Document(collection = "movies")
public class Movie {
    //this property is used to identify the unique document in the collection
    @ID
    private Object id;
    private String imdbID;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> generes;
    private List<String> backdrops;
    
}
