package main;

import student.Student;
import computer.Computer;
import course.Course;


public class Main {

    public static void main(String[] args) {
        Student defaultStudent = new Student();
        //defaultStudent.info();

        defaultStudent.setFirstName("Vladimir");
        defaultStudent.setLastName("Golubović");
        defaultStudent.setYearOfBirth(1990);
        defaultStudent.info();
        
        Course defaultCourse = defaultStudent.getCourse();
        defaultCourse.setName("QA");
        defaultCourse.setNumberOfClasses(32);
        
        defaultStudent.getComputer().setProcessTact(2.4);
        defaultStudent.getComputer().setMemory(32);
        defaultStudent.getComputer().setHardDrive(500);
        defaultStudent.info();
        
        
       
        

    }

}
