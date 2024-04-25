package io.my.movie_app_v1.service;

import io.my.movie_app_v1.dao.TicketDao;
import io.my.movie_app_v1.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService{

    @Autowired
    TicketDao ticketDao;
    @Override
    public String bookTicket(Ticket ticket) {
        ticketDao.bookTicket(ticket);
        return "Ticket Booked";

    }

    @Override
    public String deleteTicket(int id) {
        return ticketDao.deleteTicket(id);
    }
}
