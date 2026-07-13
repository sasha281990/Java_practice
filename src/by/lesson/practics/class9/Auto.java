package by.lesson.practics.class9;

public class Auto {
    private int id;
    private String brand;
    private int mileage;
    private int year;
    private int maxSpeed;
    private double price;

    public Auto(int id, String brand, int mileage, int year, int maxSpeed, double price) {
        this.id = id;
        this.brand = brand;
        this.mileage = mileage;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }

    public int getYear() {
        return year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
