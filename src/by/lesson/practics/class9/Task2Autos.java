package by.lesson.practics.class9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2Autos {
    public static void main(String[] args) {
        List<Auto> autos = new ArrayList<>(List.of(
                new Auto(1, "BMW", 120000, 2018, 240, 20000),
                new Auto(2, "Audi", 80000, 2020, 250, 25000),
                new Auto(3, "Toyota", 50000, 2016, 180, 15000),
                new Auto(4, "Kia", 30000, 2022, 190, 17000),
                new Auto(5, "Mercedes", 100000, 2015, 260, 30000),
                new Auto(6, "BMW", 40000, 2021, 245, 22000),
                new Auto(7, "Renault", 90000, 2014, 160, 9000)
        ));

        System.out.println("Самая быстрая: " + autos.stream().max(Comparator.comparingInt(Auto::getMaxSpeed)).orElse(null));
        System.out.println("Самая медленная: " + autos.stream().min(Comparator.comparingInt(Auto::getMaxSpeed)).orElse(null));
        System.out.println("Самая старая: " + autos.stream().min(Comparator.comparingInt(Auto::getYear)).orElse(null));
        System.out.println("Самая новая: " + autos.stream().max(Comparator.comparingInt(Auto::getYear)).orElse(null));

        System.out.println("Пробег 50000..100000: " +
                autos.stream()
                        .filter(a -> a.getMileage() >= 50000 && a.getMileage() <= 100000)
                        .collect(Collectors.toList()));

        System.out.println("Самая дорогая: " + autos.stream().max(Comparator.comparingDouble(Auto::getPrice)).orElse(null));
        System.out.println("Самая дешёвая: " + autos.stream().min(Comparator.comparingDouble(Auto::getPrice)).orElse(null));

        System.out.println("Пробег по возрастанию: " + AutoService.sortByMileageAsc(autos));
        System.out.println("Пробег по убыванию: " + AutoService.sortByMileageDesc(autos));
        System.out.println("Цена по возрастанию: " + AutoService.sortByPriceAsc(autos));
        System.out.println("Цена по убыванию: " + AutoService.sortByPriceDesc(autos));

        System.out.println("Пробег 20000..100000 и цена 10000..20000: " +
                autos.stream()
                        .filter(a -> a.getMileage() >= 20000 && a.getMileage() <= 100000)
                        .filter(a -> a.getPrice() >= 10000 && a.getPrice() <= 20000)
                        .collect(Collectors.toList()));

        System.out.println("Distinct марки: " +
                autos.stream().map(Auto::getBrand).distinct().collect(Collectors.toList()));

        try {
            Auto found = AutoService.findByParams(autos, "BMW", 15000, 25000, 30000, 130000, 2018, 2022);
            System.out.println("Найдена машина: " + found);
        } catch (AutoNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
