package by.lesson.practics.class6;

public class Student extends Person {
    private String faculty;

    public Student(String name, String surname, String faculty) {
        super(name, surname);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}