package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ParkingSlot {
    private int slotId;
    private VehicleType supportedVehicleType;
    private Status status;
    private ParkingFloor parkingFloor;
}
