package org.publicissapient.casestudy.bookingPlatform.services;

import org.publicissapient.casestudy.bookingPlatform.entities.City;
import org.publicissapient.casestudy.bookingPlatform.entities.Movie;
import org.publicissapient.casestudy.bookingPlatform.repository.CityRepository;
import org.publicissapient.casestudy.bookingPlatform.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private CityService cityService;

    public void releaseNewMovie(Movie movie, String cityName) {
        City city = cityService.getCity(cityName);
        movie.setCities(new ArrayList<>(Arrays.asList(city)));
        movieRepository.save(movie);
    }


    public Movie getMovieByName(String movieName) {
        return movieRepository.findByMovieName(movieName);
    }

    public void saveMovie(Movie movie) {
        movieRepository.save(movie);
    }
}
