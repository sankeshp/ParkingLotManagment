package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import models.Gate;
import models.Vehicle;

@Setter
@Getter
@Builder
public class TicketRequestObject {
    private Gate entryGate;
    private Vehicle vehicle;
}
