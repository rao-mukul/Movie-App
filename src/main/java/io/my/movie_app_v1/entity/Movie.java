package io.my.movie_app_v1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "movie_table")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movieId;
    @Column(length = 20,nullable = false,unique = true)
    private String movieName;
    @Column(nullable = false)
    private double movieRating;
    @Column(length = 10,nullable = false)
    private String genre;
    @Column(length = 50,nullable = true)
    private String movieDetails;
    @Column(nullable = false)
    private LocalDate releaseYear;
}
