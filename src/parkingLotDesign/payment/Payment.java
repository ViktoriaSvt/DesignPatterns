package parkingLotDesign.payment;

import parkingLotDesign.ParkingLot;
import parkingLotDesign.ParkingSession;

public interface Payment {
    void pay(PaymentStrategy strategy, ParkingSession session, ParkingLot lot);
}
