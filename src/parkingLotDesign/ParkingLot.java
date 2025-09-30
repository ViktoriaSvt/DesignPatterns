package parkingLotDesign;

import parkingLotDesign.vehicle.Vehicle;
import parkingLotDesign.vehicle.VehicleType;

import java.util.*;

public class ParkingLot {
    private final Map<VehicleType, PriorityQueue<ParkingSlot>> slotMap;

    public ParkingLot() {
        this.slotMap = new HashMap<>();
        for (VehicleType type : VehicleType.values()) {
            slotMap.put(type, new PriorityQueue<>(Comparator.comparing(ParkingSlot::isOccupied)));
        }
    }

    public void addSlot(ParkingSlot slot) {
        slotMap.get(slot.getVehicleType()).offer(slot);
    }

    public Optional<ParkingSession> parkVehicle(Vehicle vehicle) {
        PriorityQueue<ParkingSlot> queue = slotMap.get(vehicle.getType());
        if (queue == null || queue.isEmpty()) return Optional.empty();

        while (!queue.isEmpty()) {
            ParkingSlot slot = queue.poll();
            if (!slot.isOccupied()) {
                ParkingSession session = new ParkingSession(vehicle, slot);
                slot.assignVehicle(vehicle, session);
                queue.offer(slot);
                return Optional.of(session);
            } else {
                queue.offer(slot);
                System.out.println("Parking Lot is full !Come back later.");
                return Optional.empty();
            }
        }
        return Optional.empty();
    }

    public void releaseVehicle(ParkingSession session) {
        session.end();
        ParkingSlot slot = session.getSlot();
        slot.clear();
        slotMap.get(slot.getVehicleType()).remove(slot);
        slotMap.get(slot.getVehicleType()).offer(slot);
    }
}

