package mobil;

import java.util.ArrayList;
import java.util.List;

public class Mobil {
    private List<MerekMobil> merekMobilList;

    public Mobil() {
        this.merekMobilList = new ArrayList<>();
    }

    public void addMerekMobil(MerekMobil merekMobil) {
        merekMobilList.add(merekMobil);
    }

    public List<MerekMobil> getMerekMobilList() {
        return merekMobilList;
    }

    public void displayAllMerekMobilNames() {
        System.out.println("Semua merek mobil:");
        int index = 1;
        for (MerekMobil merek : merekMobilList) {
            System.out.println(index + ". " + merek.getNamaMerek());
            index++;
        }
    }
}
