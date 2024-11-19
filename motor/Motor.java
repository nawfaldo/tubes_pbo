package motor;

import java.util.ArrayList;
import java.util.List;

public class Motor {
    private List<MerekMotor> merekMotorList;

    public Motor() {
        this.merekMotorList = new ArrayList<>();
    }

    public void addMerekMotor(MerekMotor merekMotor) {
        merekMotorList.add(merekMotor);
    }

    public List<MerekMotor> getMerekMotorList() {
        return merekMotorList;
    }

    public void displayAllMerekMotorNames() {
        System.out.println("Semua merek motor:");
        int index = 1;
        for (MerekMotor merek : merekMotorList) {
            System.out.println(index + ". " + merek.getNamaMerek());
            index++;
        }
    }
}