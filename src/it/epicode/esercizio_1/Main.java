package it.epicode.esercizio_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dipendente d1 = new Dipendente("111", 1500, Dipartimento.AMMINISTRAZIONE);
        Dipendente d2 = new Dipendente("222", 1500, Dipartimento.VENDITE);
        Dipendente d3 = new Dipendente("333", 1200, Dipartimento.PRODUZIONE);

        ArrayList<Dipendente> dipendenti = new ArrayList<>(3);
        dipendenti.add(d1);
        dipendenti.add(d2);
        dipendenti.add(d3);

        for (int i = 0; i < dipendenti.size(); i++) {
            Dipendente dipendente = dipendenti.get(i);
            System.out.println("Matricola: " + dipendente.getMatricola() + ", Stipendio: " + dipendente.getStipendio() + "€, Dipartimento: " + dipendente.getDipartimento());
        }
    }
}
