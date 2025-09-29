package singletonPattern;

import builderPattern.Clothing;
import builderPattern.enums.Color;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my logger implementation!");

        Logger logger = Logger.getInstance();
        logger.log("processed task.");
    }
}