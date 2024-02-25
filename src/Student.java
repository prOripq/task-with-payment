public class Student extends Person {
    private static int idCounter = 1;
    private double gpa;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public String toString() {
        return "Student: " + getId() + ". " + getName() + " " + getSurname();
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660.00;
        } else {
            return 0.00;
        }
    }
}