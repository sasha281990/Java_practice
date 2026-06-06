package by.lesson.practics.class5;

public class Fridge implements Electropribori, KitchenTecnika {
    private String name;
    private String marka;
    private double price;
    private Boolean isOn;


    public  Fridge(String name, String marka, double price, Boolean isOn){
        this.name = name;
        this.marka = marka;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Морозильник морозит");
    }

    @Override
    public void gotovit() {
        System.out.println("Морозильник готовит лед");
    }

}