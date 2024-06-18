package creational.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        // Get an object of Car and call its drive method.
        Vehicle vehicle1 = vehicleFactory.getVehicle("CAR");
        vehicle1.drive();

        // Get an object of Bike and call its drive method.
        Vehicle vehicle2 = vehicleFactory.getVehicle("BIKE");
        vehicle2.drive();
    }
}
