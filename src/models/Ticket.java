package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Builder
public class Ticket {
    private int ticketId;
    private Gate entryGate;
    private Date entryTime;
    private ParkingSlot parkingSlot;
    private Vehicle vehicle;
}
