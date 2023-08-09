package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class ParkingFloor {
    private int floorId;
    private List<ParkingSlot> parkingSlotList;
}
