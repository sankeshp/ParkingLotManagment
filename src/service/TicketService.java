package service;

import java.util.Date;
import models.Gate;
import models.ParkingSlot;
import models.Status;
import models.Ticket;
import models.Vehicle;
import service.ParkingSlotService;

public class TicketService {
    ParkingSlotService parkingSlotService = new ParkingSlotService();

    public Ticket createTicket(Vehicle vehicle, Gate gate) throws Exception {
        ParkingSlot parkingSlot = this.parkingSlotService.findAvailableParkingSlot(vehicle);
        if (parkingSlot == null) {
            throw new Exception("parkingSlot not found");
        }
        Ticket ticket = Ticket.builder().ticketId(1).entryGate(gate).entryTime(new Date()).vehicle(vehicle).parkingSlot(parkingSlot).build();
        this.parkingSlotService.setParkingSlot(parkingSlot, Status.Occupied);
        return ticket;
    }
}
