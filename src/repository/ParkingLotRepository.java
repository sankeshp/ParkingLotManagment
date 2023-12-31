package repository;

import java.util.ArrayList;
import models.Gate;
import models.GateType;
import models.ParkingAttendant;
import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSlot;
import models.Status;
import models.VehicleType;

public class ParkingLotRepository {
    ParkingLot parkingLot;

    public ParkingLotRepository() {
        ArrayList<ParkingSlot> parkingSlotList = new ArrayList<ParkingSlot>();
        ParkingSlot parkingSlot1 = ParkingSlot.builder().slotId(1).supportedVehicleType(VehicleType.Car).status(Status.Avaialble).build();
        parkingSlotList.add(parkingSlot1);
        ParkingSlot parkingSlot2 = ParkingSlot.builder().slotId(2).supportedVehicleType(VehicleType.Car).status(Status.Avaialble).build();
        parkingSlotList.add(parkingSlot2);
        ArrayList<ParkingFloor> parkingFloorList = new ArrayList<ParkingFloor>();
        ParkingFloor parkingFloor1 = ParkingFloor.builder().floorId(1).parkingSlotList(parkingSlotList).build();
        parkingFloorList.add(parkingFloor1);
        parkingSlot1.setParkingFloor(parkingFloor1);
        parkingSlot2.setParkingFloor(parkingFloor1);
        ParkingAttendant parkingAttendant1 = ParkingAttendant.builder().attendantId(1).name("attendant1").build();
        ArrayList<Gate> entryGateList = new ArrayList<Gate>();
        Gate gate1 = Gate.builder().gateId(1).gateType(GateType.Entry).parkingAttendant(parkingAttendant1).build();
        entryGateList.add(gate1);
        ParkingAttendant parkingAttendant2 = ParkingAttendant.builder().attendantId(2).name("attendant2").build();
        ArrayList<Gate> exitGateList = new ArrayList<Gate>();
        Gate gate2 = Gate.builder().gateId(1).gateType(GateType.Entry).parkingAttendant(parkingAttendant2).build();
        exitGateList.add(gate2);
        this.parkingLot = ParkingLot.builder().name("parkingLot1").address("address1").parkingFloorList(parkingFloorList).entryGateList(entryGateList).exitGateList(exitGateList).build();
    }

    public ParkingLot getParkingLot() {
        return this.parkingLot;
    }
}
