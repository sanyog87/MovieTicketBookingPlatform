package org.publicissapient.casestudy.bookingPlatform.controllers;

import org.publicissapient.casestudy.bookingPlatform.entities.Movie;
import org.publicissapient.casestudy.bookingPlatform.entities.Theatre;
import org.publicissapient.casestudy.bookingPlatform.services.MovieService;
import org.publicissapient.casestudy.bookingPlatform.services.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/theatres")
public class ThreatreController {
    @Autowired
    private TheatreService theatreService;

    @Autowired
    private MovieService movieService;

    @PostMapping("/launchTheatre")
    public ResponseEntity<?> launchTheatreInPortal(@RequestBody Theatre theatre){
        try{
            theatreService.launchTheatre(theatre);
            return new ResponseEntity<>(theatre, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity("Kindly give sufficient details to launch a theatre", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/all-running-shows")
    public ResponseEntity<?> getAllShows(){
        try{
            return new ResponseEntity<>(theatreService.getAllShows(),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("No Shows At this time.. Kindly check later..",HttpStatus.NOT_FOUND);
        }
    }


    @PutMapping
    @RequestMapping("/{theatreName}/release_movie/{movieName}")
    public ResponseEntity<?> releaseMovie(@PathVariable String theatreName, @PathVariable String movieName){
        try{
            //Multiple Validations can come here like theatre should be in the city, theatre should not have any running movie and so on
            Theatre theatre = theatreService.getTheatreByName(theatreName);
            Movie movie = movieService.getMovieByName(movieName);
            if(null!=theatre && null!=movie) {
                return new ResponseEntity<>(theatreService.releaseMovie(theatre,movie),HttpStatus.OK);
            }else{
                return new ResponseEntity<>("Theatre does not exist, or the movie has not come yet !!",HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Theatre does not exist, or the movie has not come yet !!",HttpStatus.NOT_FOUND);
        }

    }

}
