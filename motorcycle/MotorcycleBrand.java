package motorcycle;

import java.util.ArrayList;

public class MotorcycleBrand extends Motorcycle {
    private String brand_name;
    private ArrayList<MotorcycleBrandProduct> products;

    public MotorcycleBrand(String brand_name) {
        this.brand_name = brand_name;
        this.products = new ArrayList<>();
    }

    public String getBrandName() {
        return brand_name;
    }

    public ArrayList<MotorcycleBrandProduct> getProducts() {
        return products;
    }

    public void addProduct(MotorcycleBrandProduct product) {
        this.products.add(product);
    }
}
