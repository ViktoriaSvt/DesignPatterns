package abstractFactoryPattern.factories;

import abstractFactoryPattern.vehicles.Truck;
import abstractFactoryPattern.vehicles.Vehicle;

public class TruckFactory extends Factory{
    @Override
    public Vehicle getVehicle() {
        return new Truck();
    }
}
