package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Builder
public class Invoice {
    private int invoiceId;
    private Ticket ticket;
    private Date exitTime;
    private Payment payment;
    private Gate exitGate;

}
