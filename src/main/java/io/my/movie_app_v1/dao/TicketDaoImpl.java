package io.my.movie_app_v1.dao;

import io.my.movie_app_v1.entity.Ticket;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl implements TicketDao{

    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public void bookTicket(Ticket ticket) {
        entityManager.persist(ticket);
    }

    @Override
    @Transactional
    public Ticket getTicketById(int Id) {
        return entityManager.find(Ticket.class,Id);
    }

    @Override
    @Transactional
    public String deleteTicket(int id) {
        Ticket ticket = getTicketById(id);
        entityManager.remove(ticket);
        return "Deleted Successfully";

    }
}

