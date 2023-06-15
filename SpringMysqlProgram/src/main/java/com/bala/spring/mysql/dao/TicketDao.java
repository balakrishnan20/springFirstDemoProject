package com.bala.spring.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bala.spring.mysql.model.Ticket;

@Repository
public interface TicketDao extends JpaRepository<Ticket, Integer>{

}
