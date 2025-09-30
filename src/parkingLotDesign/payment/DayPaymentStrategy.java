package parkingLotDesign.payment;

import parkingLotDesign.ParkingSession;
import parkingLotDesign.vehicle.Vehicle;

import java.math.BigDecimal;
import java.time.LocalTime;

public class DayPaymentStrategy implements PaymentStrategy {
    @Override
    public BigDecimal calculateFee(ParkingSession session) {
        long hours = session.getDuration().toHours();
        if (hours == 0) hours = 1;
        BigDecimal ratePerHour = new BigDecimal("2.50");
        return ratePerHour.multiply(BigDecimal.valueOf(hours));
    }

}

