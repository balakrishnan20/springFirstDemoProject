package com.bala.spring.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bala.spring.mysql.dao.TicketDao;
import com.bala.spring.mysql.model.Ticket;

@RestController
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	private TicketDao dao;
	
	@PostMapping("/bookTickets")
	public Ticket bookTicket(@RequestBody Ticket tickets) {
		dao.save(tickets);
		return dao.save(tickets);
	}
	
	@GetMapping("/getTickets")
	public List<Ticket> getTickets(){
		return (List<Ticket>) dao.findAll();
		
	}
}
