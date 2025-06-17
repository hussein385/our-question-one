
package ourcoursework;


    public class Student extends User {

    public Student(String name, String userId, String course) {
        super(name, userId);
    }

    @Override
    public void requestTransport() {
        System.out.println("Student " + getName() + " is requesting a bus.");
    }
}
    

