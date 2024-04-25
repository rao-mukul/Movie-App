package io.my.movie_app_v1.service;

import io.my.movie_app_v1.entity.Ticket;

public interface TicketService {
    String bookTicket(Ticket ticket);

    String deleteTicket(int id);
}
