package builderPattern;

import abstractFactoryPattern.VehicleDistributor;
import abstractFactoryPattern.factories.TruckFactory;
import builderPattern.enums.Color;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my clothing builder!");

        Clothing.ClothingBuilder builder = new Clothing.ClothingBuilder();
        Clothing clothing = builder.setColor(Color.BLUE)
                .setMaterial("Cotton")
                .build();

        System.out.println(clothing.getMaterial());
    }
}