package parkingLotDesign;

import observerPattern.FileAddSubscriber;
import observerPattern.FileChangeSubscriber;
import parkingLotDesign.payment.CardPayment;
import parkingLotDesign.payment.DayPaymentStrategy;
import parkingLotDesign.payment.Payment;
import parkingLotDesign.payment.PaymentStrategy;
import parkingLotDesign.vehicle.Airplane;
import parkingLotDesign.vehicle.Bike;
import parkingLotDesign.vehicle.Vehicle;
import parkingLotDesign.vehicle.VehicleType;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Parking Lot!");

        ParkingLot lot = new ParkingLot();

        lot.addSlot(new ParkingSlot(VehicleType.AIRPLANE));
        lot.addSlot(new ParkingSlot(VehicleType.BIKE));
        lot.addSlot(new ParkingSlot(VehicleType.BIKE));

        Vehicle airplane = new Airplane(3.21);
        Vehicle airplaneF1 = new Airplane(12.1);
        Vehicle bike = new Bike("Yamaha");

        Optional<ParkingSession> airplaneSession = lot.parkVehicle(airplane);
        Optional<ParkingSession> airplaneSessionD1 = lot.parkVehicle(airplaneF1);
        Optional<ParkingSession> bikeSession = lot.parkVehicle(bike);

        Payment payment = new CardPayment();
        PaymentStrategy strategy = new DayPaymentStrategy();

        airplaneSession.ifPresent(session -> payment.pay(strategy, session, lot));
        bikeSession.ifPresent(session -> payment.pay(strategy, session, lot));
    }
}