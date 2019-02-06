package course;

public class Course {

    private String name;
    private int numberOfClasses;
    private String codeName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public Course() {
        this.name = "Java Course";
        this.codeName = "Java";
        this.numberOfClasses = 50;
    }

    public Course(String name, String codeName, int numberOfClasses) {
        this.name = name;
        this.codeName = codeName;
        this.numberOfClasses = numberOfClasses;
    }

}
