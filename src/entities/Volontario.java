package entities;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Volontario implements Checker {
    private String nome;
    private int eta;
    private String cv;

    public Volontario(String nome, int eta, String cv) {
        this.setNome(nome);
        this.setEta(eta);
        this.setCv(cv);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Override
    public void checkIn() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(this.getNome() + " è entrato alle ore: " + LocalTime.now().format(myFormatObj));
    }
}
