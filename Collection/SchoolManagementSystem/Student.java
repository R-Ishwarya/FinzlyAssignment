package problem3;

class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRoll Number: " + rollNumber;
    }
}


