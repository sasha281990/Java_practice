package by.lesson.practics.class4;

public class Building {
    private String street;
    private String wallMaterial;
    private int buildYear;

    public Building(String street, String wallMaterial, int buildYear) {
        this.street = street;
        this.wallMaterial = wallMaterial;
        this.buildYear = buildYear;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWallMaterial() {
        return wallMaterial;
    }

    public void setWallMaterial(String wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }
}