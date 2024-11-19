package motorcycle;

public class MotorcycleBrandProduct extends MotorcycleBrand {
    private String product_name;

    public MotorcycleBrandProduct(String brand_name, String product_name) {
        super(brand_name);
        this.product_name = product_name;
    }

    public String getProductName() {
        return product_name;
    }
}
