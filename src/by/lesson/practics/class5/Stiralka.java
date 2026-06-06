package by.lesson.practics.class5;


public class Stiralka implements Electropribori, KitchenTecnika{
    private String name;
    private String brand;
    private double price;
    private Boolean isOn;

    public Stiralka (String name, String brand, double price, Boolean isOn) {

        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Стиралка стирает");
    }

    @Override
    public void gotovit() {
        System.out.println("Стиралка сушит");
    }
}