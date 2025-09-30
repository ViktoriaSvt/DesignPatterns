package parkingLotDesign.payment;

import parkingLotDesign.ParkingSession;
import parkingLotDesign.vehicle.Vehicle;

import java.math.BigDecimal;

public interface PaymentStrategy {
    BigDecimal calculateFee(ParkingSession session);
}
