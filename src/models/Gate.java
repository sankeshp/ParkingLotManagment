package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Gate {
    private int gateId;
    private ParkingAttendant parkingAttendant;
    private GateType gateType;
}
