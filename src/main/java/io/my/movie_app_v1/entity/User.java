package io.my.movie_app_v1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    private int userId;
    private String userName;
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;

}
