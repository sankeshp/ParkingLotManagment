package controller;

import dto.TicketRequestObject;
import models.Ticket;
import service.TicketService;

public class TicketController {
    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket createTicket(TicketRequestObject ticketRequestObject) throws Exception {
        Ticket ticket = this.ticketService.createTicket(ticketRequestObject.getVehicle(), ticketRequestObject.getEntryGate());
        return ticket;
    }
}
