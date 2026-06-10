package by.lesson.practics.class6;

public class Employee extends Person {
    private double salary;

    public Employee(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}