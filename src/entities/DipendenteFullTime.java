package entities;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class DipendenteFullTime extends Dipendente {


    public DipendenteFullTime(Dipartimenti dipartimento) {
        super(dipartimento);
    }

    @Override
    public int calculateSalary() {
        return new Random().nextInt(1000, 1400);
    }

    @Override
    public void checkIn() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Il dipendente full-time è arrivato a lavoro alle " + LocalTime.now().format(myFormatObj));
    }
}
