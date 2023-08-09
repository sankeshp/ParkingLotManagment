package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Vehicle {
    private int licenceNo;
    private VehicleType vehicleType;
}
