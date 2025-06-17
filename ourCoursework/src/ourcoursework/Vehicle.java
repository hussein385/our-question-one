
package ourcoursework;
public abstract class Vehicle {
    protected String vehicleId;
    protected String model;

    public Vehicle(String vehicleId, String model) {
        this.vehicleId = vehicleId;
        this.model = model;
    }

    public abstract void displayInfo();
}

    
