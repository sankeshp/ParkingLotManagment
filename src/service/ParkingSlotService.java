package service;

import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSlot;
import models.Status;
import models.Vehicle;
import repository.ParkingLotRepository;

public class ParkingSlotService {
    ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

    public ParkingSlot findAvailableParkingSlot(Vehicle vehicle) {
        ParkingLot parkingLot = this.parkingLotRepository.getParkingLot();
        for (ParkingFloor parkingFloor : parkingLot.getParkingFloorList()) {
            for (ParkingSlot parkingSlot : parkingFloor.getParkingSlotList()) {
                if (!parkingSlot.getStatus().equals((Object)Status.Avaialble) || !parkingSlot.getSupportedVehicleType().equals((Object)vehicle.getVehicleType())) continue;
                return parkingSlot;
            }
        }
        return null;
    }

    public void setParkingSlot(ParkingSlot parkingSlot, Status status) {
        parkingSlot.setStatus(status);
    }
}
