package io.my.movie_app_v1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ShowTime {

    @Id
    @GeneratedValue
    private int showTimeId;
    private String theater;
    private String startTime;
    private String endTime;

    @OneToMany(mappedBy = "showTime")
    private List<Seat> seat;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @OneToOne(mappedBy = "showTime")
    private Booking booking;
}
