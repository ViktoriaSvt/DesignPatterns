package parkingLotDesign.payment;

import parkingLotDesign.ParkingLot;
import parkingLotDesign.ParkingSession;

import java.math.BigDecimal;

public class CardPayment implements Payment {
    @Override
    public void pay(PaymentStrategy strategy, ParkingSession session, ParkingLot lot) {
        BigDecimal fee = strategy.calculateFee(session);
        lot.releaseVehicle(session);
        System.out.println("Vehicle left. Fee paid: " + fee);
    }
}
