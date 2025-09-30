package parkingLotDesign;
import parkingLotDesign.vehicle.Vehicle;
import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingSession {
    private final Vehicle vehicle;
    private final ParkingSlot slot;
    private final LocalDateTime startTime;
    private LocalDateTime endTime;

    public ParkingSession(Vehicle vehicle, ParkingSlot slot) {
        this.vehicle = vehicle;
        this.slot = slot;
        this.startTime = LocalDateTime.now();
    }

    public void end() {
        this.endTime = LocalDateTime.now();
    }

    public Duration getDuration() {
        LocalDateTime effectiveEnd = (endTime != null) ? endTime : LocalDateTime.now();
        return Duration.between(startTime, effectiveEnd);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSlot getSlot() {
        return slot;
    }
}
