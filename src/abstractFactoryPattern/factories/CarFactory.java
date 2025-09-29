package abstractFactoryPattern.factories;

import abstractFactoryPattern.vehicles.Car;
import abstractFactoryPattern.vehicles.Vehicle;

public class CarFactory extends Factory{
    @Override
    public Vehicle getVehicle() {
        return new Car();
    }
}
