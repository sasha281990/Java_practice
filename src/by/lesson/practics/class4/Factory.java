package by.lesson.practics.class4;

class Factory extends IndustrialBuilding {
    private int workersCount;
    private String product; // выпускаемая продукция

    public Factory(String street, String wallMaterial, int buildYear,
                   String industry, int workersCount, String product) {
        super(street, wallMaterial, buildYear, industry);
        this.workersCount = workersCount;
        this.product = product;
    }

    public int getWorkersCount() {
        return workersCount;
    }

    public void setWorkersCount(int workersCount) {
        this.workersCount = workersCount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}