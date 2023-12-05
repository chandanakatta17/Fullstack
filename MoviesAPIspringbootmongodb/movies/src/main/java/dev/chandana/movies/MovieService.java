package dev.chandana.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service //uses repository class and talks to db and returns to api layer-to pull data from db and you write db access methods here
public class MovieService {
    @Autowired //it will let framework know to instantiate the class MovieRepository here
    private MovieRepository movieRepository;  //initialize with constructor or use autowired
    public List<Movie> allMovies(){
        return movieRepository.findAll();

    }
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);

    }
}
