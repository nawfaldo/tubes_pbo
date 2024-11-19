package mobil;

import java.util.ArrayList;
import java.util.List;

public class MerekMobil extends Mobil {
    private String nama_merek;
    private List<JenisMobil> jenisMobilList;

    public MerekMobil(String nama_merek) {
        this.nama_merek = nama_merek;
        this.jenisMobilList = new ArrayList<>();
    }

    public String getNamaMerek() {
        return nama_merek;
    }

    public void addJenisMobil(JenisMobil jenisMobil) {
        jenisMobilList.add(jenisMobil);
    }

    public int getTotalJenisMobil() {
        return jenisMobilList.size();
    }

    public void displayJenisMobil() {
        System.out.println("Merek Mobil: " + nama_merek);
        System.out.println("Jenis Mobil:");
        for (JenisMobil jenis : jenisMobilList) {
            System.out.println("- " + jenis.getNamaJenis());
        }
        System.out.println("Total Jenis Mobil: " + getTotalJenisMobil());
    }

    public List<JenisMobil> getJenisMobilList() {
        return jenisMobilList;
    }
}
