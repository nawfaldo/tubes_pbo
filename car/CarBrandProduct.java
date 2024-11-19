package car;

public class CarBrandProduct extends CarBrand {
    private String product_name;

    public CarBrandProduct(String brand_name, String product_name) {
        super(brand_name);
        this.product_name = product_name;
    }

    public String getProductName() {
        return product_name;
    }
}
