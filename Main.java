import java.util.Scanner;

import car.Car;
import car.CarBrand;
import car.CarBrandProduct;

public class Main {
    public static void main(String[] args) {
        CarBrand honda = new CarBrand("Honda");
        Car.addCarBrand(honda);

        CarBrand tesla = new CarBrand("Tesla");
        Car.addCarBrand(tesla);

        honda.addProduct(new CarBrandProduct(honda.getBrandName(), "Civic"));
        honda.addProduct(new CarBrandProduct(honda.getBrandName(), "Jazz"));

        tesla.addProduct(new CarBrandProduct(tesla.getBrandName(), "Model S"));
        tesla.addProduct(new CarBrandProduct(tesla.getBrandName(), "Model X"));
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Selamat Datang di Garasi Genesis =====");
            System.out.println("1. Atur Mobil");
            System.out.println("2. Atur Motor");
            System.out.println("3. Exit");
    
            System.out.println("Pilih menu: ");
            int selectedMenu = scanner.nextInt();
    
            switch (selectedMenu) {
                case 1:
                    System.out.println();

                    System.out.println("Daftar Merek Mobil:");
                    for (CarBrand brand : Car.getCarBrands()) {
                        System.out.println("- " + brand.getBrandName());
                    }

                    System.out.println();

                    System.out.println("1. Lihat Produk Merek");
                    System.out.println("2. Tambah Merek Mobil");
                    System.out.println("3. Hapus Merek Mobil");
                    System.out.println("4. Balik");

                    System.out.println("Pilih menu: ");
                    selectedMenu = scanner.nextInt();
                    scanner.nextLine();

                    switch (selectedMenu) {
                        case 1:
                            System.out.println();

                            System.out.print("Masukkan nama brand: ");
                            String brand_name = scanner.nextLine();

                            CarBrand selectedBrand = null;
                            for (CarBrand brand : Car.getCarBrands()) {
                                if (brand.getBrandName().equalsIgnoreCase(brand_name)) {
                                    selectedBrand = brand;
                                    break;
                                }
                            }

                            if (selectedBrand != null) {
                                for (CarBrandProduct product : selectedBrand.getProducts()) {
                                    System.out.println("- " + product.getProductName());
                                }
                            } else {
                                System.out.println("Merek '" + brand_name + "' tidak ditemukan.");
                                break;
                            }

                            System.out.println();

                            System.out.println("1. Tambah Produk Merek Mobil");
                            System.out.println("2. Hapus Produk Merek Mobil");
                            System.out.println("3. Balik");

                            System.out.println("Pilih menu: ");
                            selectedMenu = scanner.nextInt();
                            scanner.nextLine();

                            switch (selectedMenu) {
                                case 1:
                                    System.out.println();

                                    System.out.print("Masukkan nama produk: ");
                                    String product_name = scanner.nextLine();

                                    selectedBrand.addProduct(new CarBrandProduct(selectedBrand.getBrandName(), product_name));
                                    
                                    System.out.println("Produk Mobil '" + product_name + "' berhasil ditambahkan!");

                                    System.out.println();

                                    break;
                                case 2:
                                    System.out.println();

                                    System.out.print("Masukkan nama produk: ");
                                    product_name = scanner.nextLine();

                                    CarBrandProduct productToRemove = null;

                                    for (CarBrandProduct product : selectedBrand.getProducts()) {
                                        if (product.getProductName().equalsIgnoreCase(product_name)) {
                                            productToRemove = product;
                                            break;
                                        }
                                    }
                                
                                    if (productToRemove != null) {
                                        selectedBrand.getProducts().remove(productToRemove);
                                        System.out.println("Produk '" + product_name + "' berhasil dihapus.");
                                    } else {
                                        System.out.println("Produk '" + product_name + "' tidak ditemukan.");
                                    }

                                    System.out.println();

                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Pilihan tidak tersedia");
                                    break;
                            }

                            break;
                        case 2:
                            System.out.println();

                            System.out.print("Masukkan nama brand: ");
                            brand_name = scanner.nextLine();

                            CarBrand newCarBrand = new CarBrand(brand_name);
                            Car.addCarBrand(newCarBrand);

                            System.out.println("Merek Mobil '" + brand_name + "' berhasil ditambahkan!");

                            System.out.println();

                            break;
                        case 3:
                            System.out.println();

                            System.out.print("Masukkan nama brand: ");
                            brand_name = scanner.nextLine();

                            CarBrand brandToRemove = null;
                            for (CarBrand brand : Car.getCarBrands()) {
                                if (brand.getBrandName().equalsIgnoreCase(brand_name)) {
                                    brandToRemove = brand;
                                    break;
                                }
                            }
                        
                            if (brandToRemove != null) {
                                Car.getCarBrands().remove(brandToRemove);
                                System.out.println("Merek '" + brand_name + "' berhasil dihapus.");
                            } else {
                                System.out.println("Merek '" + brand_name + "' tidak ditemukan.");
                            }

                            System.out.println();
                            
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Pilihan tidak tersedia");
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }
    }
}
