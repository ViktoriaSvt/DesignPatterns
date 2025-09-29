package abstractFactoryPattern.vehicles;

public class Truck extends Vehicle {
    @Override
    public void move() {
        System.out.println("Starting truck... Vroom Vroom");
    }

    @Override
    public void stop() {
        System.out.println("Stopping truck... sdncfkjsbdb");
    }
}
