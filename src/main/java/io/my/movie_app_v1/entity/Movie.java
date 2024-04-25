package io.my.movie_app_v1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "movie_table")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;
    @Column(length = 20,nullable = false,unique = true)
    private String movieName;
    @Column(nullable = false)
    private double movieRating;
    @Column(length = 10,nullable = false)
    private String genre;
    @Column(length = 50)
    private String movieDetails;
    @Column(nullable = false)
    private LocalDate releaseYear;

    @OneToMany(mappedBy = "movie")
    private List<Ticket> tickets;

    @OneToMany(mappedBy = "movie")
    private List<ShowTime> showTimes;
}
