package car;

import java.util.ArrayList;

public class Car {
    private static ArrayList<CarBrand> carBrands = new ArrayList<>();

    public static void addCarBrand(CarBrand brand) {
        carBrands.add(brand);
    }

    public static ArrayList<CarBrand> getCarBrands() {
        return carBrands;
    }
}
