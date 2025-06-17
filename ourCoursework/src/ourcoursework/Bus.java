
package ourcoursework;

public class Bus extends Vehicle implements Serviceable, Trackable {

    public Bus(String vehicleId, String model) {
        super(vehicleId, model);
    }

    @Override
    public void displayInfo() {
        System.out.println("Bus Model: " + model);
    }

    @Override
    public void serviceVehicle() {
        System.out.println("Servicing Bus...");
    }

    @Override
    public void trackLocation() {
        System.out.println("Tracking bus location...");
    }
}
