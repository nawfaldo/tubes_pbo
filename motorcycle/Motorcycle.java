package motorcycle;

import java.util.ArrayList;

public class Motorcycle {
    private static ArrayList<MotorcycleBrand> motorcycleBrands = new ArrayList<>();

    public static void addMotorcycleBrand(MotorcycleBrand brand) {
        motorcycleBrands.add(brand);
    }

    public static ArrayList<MotorcycleBrand> getMotorcycleBrands() {
        return motorcycleBrands;
    }
}
