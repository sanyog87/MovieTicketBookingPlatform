package org.publicissapient.casestudy.bookingPlatform.services;

import org.publicissapient.casestudy.bookingPlatform.entities.Movie;
import org.publicissapient.casestudy.bookingPlatform.entities.Theatre;
import org.publicissapient.casestudy.bookingPlatform.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class TheatreService {
    @Autowired
    private TheatreRepository theatreRepository;
    @Autowired
    private MovieService movieService;

    public void launchTheatre(Theatre theatre) {
        theatreRepository.save(theatre);
    }

    public List<Theatre> getAllShows() {
        return theatreRepository.findAll();
    }

    public Theatre getTheatreByName(String theatreName) {
        return theatreRepository.findByTheatreName(theatreName);
    }

    public Movie releaseMovie(Theatre theatre, Movie movie) {

        List<Theatre> movieReleaseTheatres = movie.getMovieReleaseTheatres();
        //if(null!=movieReleaseTheatres) {
        movieReleaseTheatres.add(theatre);
        movie.setMovieReleaseTheatres(movieReleaseTheatres);
//        }else{
//            movie.setMovieReleaseTheatres(new ArrayList<>(Arrays.asList(theatre)));
//        }

        theatre.setMovie(movie);
        theatre.setSeatingCapacity(100);
//        Map<String, Integer> remaining = theatre.getRemainingSeatsOfShow();
//        remaining.put("MORNING", theatre.getSeatingCapacity());
//        remaining.put("NOON", theatre.getSeatingCapacity());
//        remaining.put("NIGHT", theatre.getSeatingCapacity());
//        theatre.setRemainingSeatsOfShow(remaining);

        theatreRepository.save(theatre);
        movieService.saveMovie(movie);
        return movie;
    }
}
