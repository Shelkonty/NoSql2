package dev.magzhan.NoSql2.Service;

import dev.magzhan.NoSql2.DataDocumentation.Movie;
import dev.magzhan.NoSql2.Repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getAllMovies(){
        System.out.println(movieRepository.findAll().toString());
        return movieRepository.findAll();
    }
    public Optional<Movie> getMovieById(ObjectId imdbId){
        return movieRepository.findById(imdbId);
    }

}
