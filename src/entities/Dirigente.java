package entities;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Dirigente extends Dipendente {

    public Dirigente(Dipartimenti dipartimento) {
        super(dipartimento);
    }

    @Override
    public int calculateSalary() {
        return new Random().nextInt(2000, 3200);
    }

    @Override
    public void checkIn() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Il dirigente è arrivato a lavoro alle " + LocalTime.now().format(myFormatObj));
    }
}
