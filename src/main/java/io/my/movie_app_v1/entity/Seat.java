package io.my.movie_app_v1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Seat {
    @Id
    @GeneratedValue
    private int seatId;
    private int row;
    private int seatNumber;

    @ManyToOne
    @JoinColumn(name = "show_time_id")
    @JsonIgnore
    private ShowTime showTime;

}
