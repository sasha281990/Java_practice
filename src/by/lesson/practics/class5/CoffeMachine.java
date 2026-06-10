package by.lesson.practics.class5;

public class CoffeMachine implements Electropribori{
    private String name;
    private String functions;
    private int price;
    private Boolean isOn;

    CoffeMachine(String name, String functions, int price, Boolean isOn) {
        this.name = name;
        this.functions = functions;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Кофемашина варит кофе");

    }

    void switchOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Кофемашина выключена");
        } else {
            System.out.println("Кофемашина уже выключена");
        }
    }
}