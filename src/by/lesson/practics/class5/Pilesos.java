package by.lesson.practics.class5;

public class Pilesos implements Electropribori {
    private String name;
    private String brand;
    private double price;
    private boolean isOn;

    public Pilesos(String name, String brand, double price, boolean b) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = false;
    }

    @Override
    public void work() {
        System.out.println("Пылесос убирает");
    }

    public String getName() {
        return name;
    }
}