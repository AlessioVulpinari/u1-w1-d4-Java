package entities;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class DipendentePartTime extends Dipendente {

//    private final int hoursWorked;
//    private final double salaryForHours;

    public DipendentePartTime(Dipartimenti dipartimento) {

        super(dipartimento);
//        this.hoursWorked = hoursWorked;
//        this.salaryForHours = salaryForHours;
    }

    @Override
    public int calculateSalary() {
        return (int) (new Random().nextInt(60, 90) * new Random().nextInt(8, 13));
    }

    @Override
    public void checkIn() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Il dipendente part-time è arrivato a lavoro alle " + LocalTime.now().format(myFormatObj));
    }
}
