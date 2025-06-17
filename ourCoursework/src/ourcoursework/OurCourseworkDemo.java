
package ourcoursework;

public class OurCourseworkDemo {
    public static void main(String[] args) {
        // Polymorphism: runtime
        User s = new Student("Ali", "ST001", "BIT");
        User l = new Lecturer("Dr. Joan", "LC001", "Computer Science");
        
        s.requestTransport();
        l.requestTransport();

        // Interface implementation
        Vehicle bus = new Bus("BUS123", "Toyota Coaster");
        bus.displayInfo();
        ((Serviceable) bus).serviceVehicle();
        ((Trackable) bus).trackLocation();

        // Method overloading
        DriverAssignment assign = new DriverAssignment();
        assign.assignDriver("Bus");
        assign.assignDriver("Van", "Morning");
    }
}

