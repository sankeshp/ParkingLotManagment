package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import models.Gate;
import models.Ticket;

@Setter
@Getter
@Builder
public class InvoiceRequestObject {
    private Ticket ticket;
    private Gate exitGate;
}
