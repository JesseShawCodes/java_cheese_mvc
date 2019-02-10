package school;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;
    // name setters
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    // studentId getters and setters.
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }
    // numberOfCredits getters and setters.

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }
    // gpa getters and setters.

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }
}