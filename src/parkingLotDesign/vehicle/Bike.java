package parkingLotDesign.vehicle;

public class Bike implements Vehicle {
    private final String model;

    public Bike(String model) {
        this.model = model;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.BIKE;
    }

    public String getModel() {
        return model;
    }
}
