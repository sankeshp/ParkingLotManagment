package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ParkingAttendant {
    private int attendantId;
    private String name;

}
