
package ourcoursework;


    public class Lecturer extends User {

    public Lecturer(String name, String userId, String department) {
        super(name, userId);
    }

    @Override
    public void requestTransport() {
        System.out.println("Lecturer " + getName() + " needs a van.");
    }
}
    

