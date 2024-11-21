package it.epicode.esercizio_2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Dipendente d1FT = new DipendenteFullTime("111", 1100, Dipartimento.AMMINISTRAZIONE);
        Dipendente d2FT = new DipendenteFullTime("222", 900, Dipartimento.PRODUZIONE);
        Dipendente d3FT = new DipendenteFullTime("333", 1200, Dipartimento.VENDITE);

        Dipendente d1PT = new DipendentePartTime("aaa", 800, Dipartimento.AMMINISTRAZIONE);
        Dipendente d2PT = new DipendentePartTime("bbb", 800, Dipartimento.PRODUZIONE);
        Dipendente d3PT = new DipendentePartTime("ccc", 800, Dipartimento.VENDITE);

        Dipendente d1DG = new Dirigente("yyy", 1100, Dipartimento.AMMINISTRAZIONE);
        Dipendente d2DG = new Dirigente("zzz", 1000, Dipartimento.PRODUZIONE);
        Dipendente d3DG = new Dirigente("www", 1200, Dipartimento.VENDITE);

        ArrayList<Dipendente> dipendenti = new ArrayList<>(6);
        dipendenti.add(d1FT);
        dipendenti.add(d2FT);
        dipendenti.add(d3FT);
        dipendenti.add(d1PT);
        dipendenti.add(d2PT);
        dipendenti.add(d3PT);
        dipendenti.add(d1DG);
        dipendenti.add(d2DG);

        double totaleStipendi = 0;
        for (int i = 0; i < dipendenti.size(); i++) {
            Dipendente dipendente = dipendenti.get(i);
            System.out.println("Matricola: " + dipendente.getMatricola() + ", Stipendio: " + dipendente.calculateSalary() + "€, Dipartimento: " + dipendente.getDipartimento());
            totaleStipendi += dipendente.calculateSalary();
        }
        System.out.println("Totale stipendi: " + totaleStipendi + "€");

    }
}
