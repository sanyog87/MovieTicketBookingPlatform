package org.publicissapient.casestudy.bookingPlatform.controllers;

import org.publicissapient.casestudy.bookingPlatform.entities.Movie;
import org.publicissapient.casestudy.bookingPlatform.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping("/release_new_movie/{city}")
    public ResponseEntity<?> releaseNewMovie(@RequestBody Movie movie, @PathVariable String city) {
        try{
            movieService.releaseNewMovie(movie, city);
            return new ResponseEntity<>(movie, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>("Kindly give sufficient details of movie", HttpStatus.BAD_REQUEST);
        }
    }
}
