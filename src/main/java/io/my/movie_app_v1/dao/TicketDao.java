package io.my.movie_app_v1.dao;

import io.my.movie_app_v1.entity.Ticket;
import jakarta.transaction.Transactional;


public interface TicketDao {
    void bookTicket(Ticket ticket);

    @Transactional
    Ticket getTicketById(int Id);

    String deleteTicket(int id);
}
