package by.lesson.practics.class6;

public class Desk<T, U> {
    private Integer inventoryNumber;
    private U person;

    public Desk(Integer inventoryNumber, U person) {
        this.inventoryNumber = inventoryNumber;
        this.person = person;
    }

    public void setInventoryNumber(Integer inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public Integer getInventoryNumber() {
        return inventoryNumber;
    }

    public void setPerson(U person) {
        this.person = person;
    }

    public U getPerson() {
        return person;
    }

    // Метод для вывода имени персонажа
    public void printPersonName() {
        if (person instanceof Person) {
            Person p = (Person) person;
            System.out.println("За столом " + inventoryNumber + " сидит: " + p.getName() + " " + p.getSurname());
        } else {
            System.out.println("За столом " + inventoryNumber + " сидит: " + person);
        }
    }
}