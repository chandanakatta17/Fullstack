package dev.chandana.movies;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;
@Document(collection="movies")
@Data  //takes care of all setters,getters [lombok]
@AllArgsConstructor //creating a constructor which takes all private fields as arguments[lombok]
@NoArgsConstructor //[lombok] no args constructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference //this will cause db to store only the ids of review and review will be in separate collection.
    //this is called many one relationship
    private List<Review> reviewIds;  //embedded relationship



}
