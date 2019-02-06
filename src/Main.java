
import student.Student;
import course.Course;

public class Main {

    public static void main(String[] args) {
        Student Student = new Student();
        Student.info();

        Student.setFirstName("Vladimir");
        Student.setLastName("Petrovic");
        Student.setYearOfBirth(1980);
        Student.info();

    }

}
