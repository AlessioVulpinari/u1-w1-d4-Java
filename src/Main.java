import entities.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// ------------------------ PARTE DELL'ESERCIZIO 1 ----------------------------

//        Dipendente dip1 = new Dipendente(Dipartimenti.PRODUZIONE);
//        Dipendente dip2 = new Dipendente(Dipartimenti.VENDITE);
//        Dipendente dip3 = new Dipendente(Dipartimenti.AMMINISTRAZIONE);
//
//        Dipendente[] arrayOfDipendenti = {dip1, dip2, dip3};
//
//        for (int i = 0; i < arrayOfDipendenti.length; i++) {
//            System.out.println(arrayOfDipendenti[i].getMatricola());
//
//
//        }

        DipendenteFullTime dip1 = new DipendenteFullTime(Dipartimenti.AMMINISTRAZIONE);
        DipendentePartTime dip2 = new DipendentePartTime(Dipartimenti.VENDITE);
        Dirigente dip3 = new Dirigente(Dipartimenti.PRODUZIONE);
        DipendentePartTime dip4 = new DipendentePartTime(Dipartimenti.PRODUZIONE);
        double totalSalary = 0;

        Dipendente[] dipendenti = {dip1, dip2, dip3, dip4};

        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println("Stipendio dipendente: " + (i + 1) + " " + dipendenti[i].getStipendio());
            totalSalary += dipendenti[i].getStipendio();
        }

        System.out.println("Il totale degli stipendi è: " + totalSalary);

        System.out.println("-------------- CHECKERS -----------------------");

        Volontario vol1 = new Volontario("Cristian", 24, "Apprendista web developer.");
        Volontario vol2 = new Volontario("Davide", 25, "Raccoglitore di patate.");

        Checker[] checkers = {dip1, dip2, dip3, vol1, vol2};

        for (int i = 0; i < checkers.length; i++) {
            checkers[i].checkIn();
        }
    }
}