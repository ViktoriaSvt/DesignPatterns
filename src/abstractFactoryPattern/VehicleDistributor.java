package abstractFactoryPattern;

import abstractFactoryPattern.factories.Factory;
import abstractFactoryPattern.vehicles.Vehicle;

public class VehicleDistributor {
    private Factory vehicleFactory;

    public VehicleDistributor(Factory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    public void testDrive(){
       Vehicle vehicle = vehicleFactory.getVehicle();
       vehicle.move();
       vehicle.stop();
       System.out.println("test drive finsihed for vehicle");
    }
}
