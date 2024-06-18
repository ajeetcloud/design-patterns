package creational.factory;

public class VehicleFactory {

    // Factory method to create objects based on input type
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equals("CAR")) {
            return new Car();
        } else if (vehicleType.equals("BIKE")) {
            return new Bike();
        }
        return null;
    }
}
