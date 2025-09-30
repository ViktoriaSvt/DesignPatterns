package parkingLotDesign.vehicle;

import parkingLotDesign.vehicle.Vehicle;
import parkingLotDesign.vehicle.VehicleType;

public class Airplane implements Vehicle {
    private final double wingDiameter;

    public Airplane(double wingDiameter) {
        this.wingDiameter = wingDiameter;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.AIRPLANE;
    }

    public double getWingDiameter() {
        return wingDiameter;
    }
}