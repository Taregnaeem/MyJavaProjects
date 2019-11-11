public class Student {
    private String name;
    private String studentNumber;

    public Student(String Student, String studentNumber) {
        this.name = Student;
        this.studentNumber = studentNumber;

    }

    public String getName() {
        return this.name;
    }

    public String getStudentNumber() {
        return (this.studentNumber);
    }

    public String toString() {
        // returns the string representation
        return this.name + " (" + this.studentNumber + ")";
    }

}