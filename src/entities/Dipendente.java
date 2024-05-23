package entities;

import java.util.Random;

public abstract class Dipendente implements Checker {
    private int matricola;
    private int stipendio;
    private Dipartimenti dipartimento;

    public Dipendente(Dipartimenti dipartimento) {
        this.matricola = new Random().nextInt(1, 2999);
        this.stipendio = calculateSalary();
        this.dipartimento = dipartimento;
    }

    public abstract int calculateSalary();

    public double getStipendio() {
        return stipendio;
    }

    public int getMatricola() {
        return matricola;
    }

    public Dipartimenti getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimenti dipartimento) {
        this.dipartimento = dipartimento;
    }
}
