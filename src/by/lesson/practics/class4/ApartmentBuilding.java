package by.lesson.practics.class4;

public class ApartmentBuilding extends CivilBuilding {
    private int apartmentsCount;

    public ApartmentBuilding(String street, String wallMaterial, int buildYear,
                             String purpose, int floors, int apartmentsCount) {
        super(street, wallMaterial, buildYear, purpose, floors);
        this.apartmentsCount = apartmentsCount;
    }

    public int getApartmentsCount() {
        return apartmentsCount;
    }

    public void setApartmentsCount(int apartmentsCount) {
        this.apartmentsCount = apartmentsCount;
    }
}