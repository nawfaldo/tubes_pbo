package motor;

import java.util.ArrayList;
import java.util.List;

public class MerekMotor extends Motor {
    private String nama_merek;
    private List<JenisMotor> jenisMotorList;

    public MerekMotor(String nama_merek) {
        this.nama_merek = nama_merek;
        this.jenisMotorList = new ArrayList<>();
    }

    public String getNamaMerek() {
        return nama_merek;
    }

    public void addJenisMotor(JenisMotor jenisMotor) {
        jenisMotorList.add(jenisMotor);
    }

    public int getTotalJenisMotor() {
        return jenisMotorList.size();
    }

    public void displayJenisMobil() {
        System.out.println("Merek Motor: " + nama_merek);
        System.out.println("Jenis Motor:");
        for (JenisMotor jenis : jenisMotorList) {
            System.out.println("- " + jenis.getNamaJenis());
        }
        System.out.println("Total Jenis Motor: " + getTotalJenisMotor());
    }

    public List<JenisMotor> getJenisMotorList() {
        return jenisMotorList;
    }
}