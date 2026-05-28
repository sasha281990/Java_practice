package by.lesson.practics.class4;

public class AdministrativeBuilding extends CivilBuilding {
    private String adminPurpose; // офисное, кинотеатр, спортсооружение
    private int capacity; // число людей

    public AdministrativeBuilding(String street, String wallMaterial, int buildYear,
                                  String purpose, int floors,
                                  String adminPurpose, int capacity) {
        super(street, wallMaterial, buildYear, purpose, floors);
        this.adminPurpose = adminPurpose;
        this.capacity = capacity;
    }

    public String getAdminPurpose() {
        return adminPurpose;
    }

    public void setAdminPurpose(String adminPurpose) {
        this.adminPurpose = adminPurpose;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}