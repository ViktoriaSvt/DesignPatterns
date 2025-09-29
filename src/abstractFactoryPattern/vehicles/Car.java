package abstractFactoryPattern.vehicles;

public class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Starting car... Vroom Vroom");
    }

    @Override
    public void stop() {
        System.out.println("Stopping car... sdncfkjsbdb");
    }
}

