package io.my.movie_app_v1.controller;

import io.my.movie_app_v1.entity.Movie;
import io.my.movie_app_v1.entity.Ticket;
import io.my.movie_app_v1.service.MovieService;
import io.my.movie_app_v1.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movieapp-v1")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/save")
    public String saveMovieData(@RequestBody Movie movie) {
        return movieService.createMovie(movie);
    }

    @GetMapping("/getAll")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/getById/{movieId}")
    public Movie getMovieId(@PathVariable int movieId) {
        return movieService.getById(movieId);
    }

    @DeleteMapping("/deleteById/{Id}")
    public String deleteById(@PathVariable int Id) {
        return movieService.deleteById(Id);
    }

    @PutMapping("/update/{id}")
    public Movie modifyMovie(@RequestBody Movie movie, @PathVariable int id) {
        return movieService.updateById(id, movie);
    }

    // Sorting Operations

    @GetMapping("/sortByRating")
    public List<Movie> sortByRating() {
        return movieService.sortByRating();
    }

    @GetMapping("/sortByYear")
    public List<Movie> sortByYear() {
        return movieService.sortByYear();
    }

//                Filter Operation

    @GetMapping("/filterByGenre/{genre}")
    public List<Movie> filterByGenre(@PathVariable String genre) {
        return movieService.filterByGenre(genre);
    }


// Get All movies
// Get movie by Id

// Book Ticket
// Cancel Ticket by Id


                // Ticket Controller

            // Book Ticket

    @Autowired
    TicketService ticketService;

    @PostMapping("/movie/{id}/ticket")
    public String bookTicket(@RequestBody Ticket ticket,@PathVariable int id) {
        ticket.setMovie(movieService.getById(id));
        return ticketService.bookTicket(ticket);
    }

    // Cancel Ticket By Id
    @DeleteMapping("/deleteTicket/{Id}")
    public String deleteTicket(@PathVariable int Id) {
        return ticketService.deleteTicket(Id);
    }


}