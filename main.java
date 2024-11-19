import java.util.Scanner;

import mobil.JenisMobil;
import mobil.MerekMobil;
import mobil.Mobil;
import motor.JenisMotor;
import motor.MerekMotor;
import motor.Motor;

public static void main(String[] args) {
    Mobil mobil = new Mobil();

    MerekMobil honda = new MerekMobil("Honda");
    MerekMobil toyota = new MerekMobil("Toyota");

    mobil.addMerekMobil(honda);
    mobil.addMerekMobil(toyota);

    JenisMobil civic = new JenisMobil(honda.getNamaMerek(), "Civic", 2024, 180, 5, 1.5);
    JenisMobil jazz = new JenisMobil(honda.getNamaMerek(), "Jazz", 2022, 150, 5, 1.3);

    honda.addJenisMobil(civic);
    honda.addJenisMobil(jazz);

    JenisMobil corolla = new JenisMobil("Toyota", "Corolla", 2022, 170, 5, 1.4);
    JenisMobil camry = new JenisMobil("Toyota", "Camry", 2024, 190, 5, 1.7);

    toyota.addJenisMobil(corolla);
    toyota.addJenisMobil(camry);

    Motor motor = new Motor();

    MerekMotor kawasaki = new MerekMotor("Kawasaki");
    MerekMotor suzuki = new MerekMotor("Suzuki");

    motor.addMerekMotor(kawasaki);
    motor.addMerekMotor(suzuki);

    JenisMotor ninja250 = new JenisMotor(kawasaki.getNamaMerek(), "Ninja 250", 2017, 100, 0.5);
    JenisMotor klx150 = new JenisMotor(kawasaki.getNamaMerek(), "KLX 150", 2013, 90, 0.7);

    kawasaki.addJenisMotor(ninja250);
    kawasaki.addJenisMotor(klx150);

    JenisMotor nex2 = new JenisMotor(kawasaki.getNamaMerek(), "Nex 2", 2020, 50, 0.4);
    JenisMotor satria150 = new JenisMotor(kawasaki.getNamaMerek(), "Satria F150", 2013, 60, 0.45);

    suzuki.addJenisMotor(nex2);
    suzuki.addJenisMotor(satria150);

    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("===== Selamat Datang di Garasi Genesis =====");
        System.out.println("1. Atur Mobil");
        System.out.println("2. Atur Motor");

        System.out.println("3. Exit");

        System.out.println("Pilih menu: ");
        int pilihanMenu = scanner.nextInt();

        switch (pilihanMenu) {
            case 1:
                System.out.println();

                mobil.displayAllMerekMobilNames();

                System.out.println("Pilih jenis merek: ");
                System.out.println("1. Tambah merek: ");

                int pilihanMerekMobil = scanner.nextInt();

                if (pilihanMerekMobil >= 1 && pilihanMerekMobil <= mobil.getMerekMobilList().size()) {
                    System.out.println();

                    MerekMobil selectedMerek = mobil.getMerekMobilList().get(pilihanMerekMobil - 1);
                    System.out.println("Jenis mobil di bawah merek " + selectedMerek.getNamaMerek() + ":");
                    for (JenisMobil jenis : selectedMerek.getJenisMobilList()) {
                        System.out.println("- " + jenis.getNamaJenis());
                    }
                } else {
                    System.out.println("Pilihan tidak tersedia.");
                }

                System.out.println();

                break;
            case 2:
                System.out.println();

                motor.displayAllMerekMotorNames();

                System.out.println("Pilih jenis merek: ");

                int pilihanMerekMotor = scanner.nextInt();

                if (pilihanMerekMotor >= 1 && pilihanMerekMotor <= motor.getMerekMotorList().size()) {
                    System.out.println();

                    MerekMotor selectedMerek = motor.getMerekMotorList().get(pilihanMerekMotor - 1);
                    System.out.println("Jenis mobil di bawah merek " + selectedMerek.getNamaMerek() + ":");
                    for (JenisMotor jenis : selectedMerek.getJenisMotorList()) {
                        System.out.println("- " + jenis.getNamaJenis());
                    }
                } else {
                    System.out.println("Pilihan tidak tersedia.");
                }

                System.out.println();

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