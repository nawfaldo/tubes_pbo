package car;

import java.util.ArrayList;

public class CarBrand extends Car {
    private String brand_name;
    private ArrayList<CarBrandProduct> products;

    public CarBrand(String brand_name) {
        this.brand_name = brand_name;
        this.products = new ArrayList<>();
    }

    public String getBrandName() {
        return brand_name;
    }

    public ArrayList<CarBrandProduct> getProducts() {
        return products;
    }

    public void addProduct(CarBrandProduct product) {
        this.products.add(product);
    }
}
