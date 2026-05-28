package by.lesson.practics.class4;

public class IndustrialBuilding extends Building {
    private String industry; // отрасль

    public IndustrialBuilding(String street, String wallMaterial, int buildYear,
                              String industry) {
        super(street, wallMaterial, buildYear);
        this.industry = industry;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
}