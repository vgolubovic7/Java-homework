
import student.Student;
import course.Course;
import computer.Computer;

public class Main {

    public static void main(String[] args) {
        Student defaultStudent = new Student();
        defaultStudent.info();

        defaultStudent.setFirstName("Vladimir");
        defaultStudent.setLastName("Golubović");
        defaultStudent.setYearOfBirth(1990);
        defaultStudent.info();
        
       
        

    }

}
