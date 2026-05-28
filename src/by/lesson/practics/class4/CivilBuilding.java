package by.lesson.practics.class4;

public class CivilBuilding extends Building {
    private String purpose; // жилье или общественные здания
    private int floors;

    public CivilBuilding(String street, String wallMaterial, int buildYear,
                         String purpose, int floors) {
        super(street, wallMaterial, buildYear);
        this.purpose = purpose;
        this.floors = floors;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}