package parkingLotDesign;

import parkingLotDesign.ParkingSession;
import parkingLotDesign.vehicle.Vehicle;
import parkingLotDesign.vehicle.VehicleType;

public class ParkingSlot {
    private final VehicleType vehicleType;
    private boolean occupied;
    private Vehicle currentVehicle;
    private ParkingSession session;

    public ParkingSlot(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        this.occupied = false;
    }

    public void assignVehicle(Vehicle vehicle, ParkingSession session) {
        this.currentVehicle = vehicle;
        this.session = session;
        this.occupied = true;
    }

    public void clear() {
        this.currentVehicle = null;
        this.session = null;
        this.occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Vehicle getCurrentVehicle() {
        return currentVehicle;
    }

    public ParkingSession getSession() {
        return session;
    }
}