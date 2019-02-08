package student;

import computer.Computer;
import course.Course;

public class Student {

    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Course getCourse() {
        return course;
    }

    public Computer getComputer() {
        return computer;
        
    }

    public Student() {
        this.firstName = "Vlada";
        this.lastName = "Golubovic";
        this.yearOfBirth = 1989;
        this.course = new Course();
        this.computer = new Computer();

    }

    public Student(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;

    }

    public void info() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Year of birth: " + this.yearOfBirth);
        System.out.println("Course name: " + this.course.getName());
        System.out.println("Number of classes: " + this.course.getNumberOfClasses());
        System.out.println("Process tact: " + this.computer.getProcessTact());
        System.out.println("Memory: " + this.computer.getMemory());
        System.out.println("Hard drive: " + this.computer.getHardDrive());
        System.out.println("");

    }
}
