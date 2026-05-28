package by.lesson.practics.class4;

import java.util.ArrayList;
import java.util.List;

public class Village {
    private String name;
    private List<Building> buildings;

    public Village(String name) {
        this.name = name;
        this.buildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public String getName() {
        return name;
    }
}