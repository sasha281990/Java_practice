package by.lesson.practics.class4;

public class Main {
    public static void main(String[] args) {
        // 2.1 Создать спортсооружение
        AdministrativeBuilding stadium = new AdministrativeBuilding(
                "Улица Спортивная 1",
                "Бетон",
                2020,
                "общественное",
                2,
                "спортсооружение",
                500  // начальная вместимость
        );

        // 2.2 Получить и вывести количество людей
        int capacity = stadium.getCapacity();
        System.out.println("Вместимость спортсооружения: " + capacity + " человек");

        // 2.3 Изменить количество людей и вывести после изменения
        stadium.setCapacity(750);
        int newCapacity = stadium.getCapacity();
        System.out.println("Новая вместимость спортсооружения: " + newCapacity + " человек");
    }
}