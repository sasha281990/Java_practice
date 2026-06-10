package by.lesson.practics.class6;

// Файл: Main.java
public class Main {
    public static void main(String[] args) {
        // 7. Создаем три стола, за которыми будут сидеть студент и сотрудник
        Student student1 = new Student("Иван", "Иванов", "Информатики");
        Student student2 = new Student("Мария", "Петрова", "Математики");

        Employee employee1 = new Employee("Алексей", "Сидоров", 500000.0);
        Employee employee2 = new Employee("Елена", "Смирнова", 650000.0);

        // Создаем три стола с инвентарными номерами и персонажами
        Desk<Integer, Student> desk1 = new Desk<>(1001, student1);
        Desk<Integer, Employee> desk2 = new Desk<>(1002, employee1);
        Desk<Integer, Student> desk3 = new Desk<>(1003, student2);

        // 8. Выводим поочередно имена персонажей, которые сидят за столами
        System.out.println("=== ПЕРСОНАЛ ЗА СТОЛАМИ ===");
        desk1.printPersonName();
        desk2.printPersonName();
        desk3.printPersonName();

        // Дополнительно: демонстрируем доступ к данным
        System.out.println("\n=== ДОПОЛНИТЕЛЬНАЯ ИНФОРМАЦИЯ ===");
        System.out.println("Студент 1: " + desk1.getPerson().getName() + " " +
                desk1.getPerson().getSurname() + ", факультет: " +
                desk1.getPerson().getFaculty());
        System.out.println("Сотрудник 1: " + desk2.getPerson().getName() + " " +
                desk2.getPerson().getSurname() + ", зарплата: " +
                desk2.getPerson().getSalary());
        System.out.println("Студент 2: " + desk3.getPerson().getName() + " " +
                desk3.getPerson().getSurname() + ", факультет: " +
                desk3.getPerson().getFaculty());
    }
}