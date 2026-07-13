package by.lesson.practics.class9;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AutoService {

    public static Auto findByParams(List<Auto> autos, String brand, double minPrice, double maxPrice,
                                    int minMileage, int maxMileage, int minYear, int maxYear) {
        return autos.stream()
                .filter(a -> a.getBrand().equalsIgnoreCase(brand))
                .filter(a -> a.getPrice() >= minPrice && a.getPrice() <= maxPrice)
                .filter(a -> a.getMileage() >= minMileage && a.getMileage() <= maxMileage)
                .filter(a -> a.getYear() >= minYear && a.getYear() <= maxYear)
                .findFirst()
                .orElseThrow(() -> new AutoNotFoundException("Машина по заданным параметрам не найдена"));
    }

    public static List<Auto> sortByMileageAsc(List<Auto> autos) {
        return autos.stream().sorted(Comparator.comparingInt(Auto::getMileage)).collect(Collectors.toList());
    }

    public static List<Auto> sortByMileageDesc(List<Auto> autos) {
        return autos.stream().sorted(Comparator.comparingInt(Auto::getMileage).reversed()).collect(Collectors.toList());
    }

    public static List<Auto> sortByPriceAsc(List<Auto> autos) {
        return autos.stream().sorted(Comparator.comparingDouble(Auto::getPrice)).collect(Collectors.toList());
    }

    public static List<Auto> sortByPriceDesc(List<Auto> autos) {
        return autos.stream().sorted(Comparator.comparingDouble(Auto::getPrice).reversed()).collect(Collectors.toList());
    }
}
