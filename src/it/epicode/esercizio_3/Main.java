package it.epicode.esercizio_3;

import it.epicode.esercizio_2.Dipartimento;
import it.epicode.esercizio_2.Dipendente;
import it.epicode.esercizio_2.DipendenteFullTime;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Volontario v1 = new Volontario("Mario Rossi", 20, "volontario");
        Dipendente d1 = new DipendenteFullTime("111", 1500, Dipartimento.AMMINISTRAZIONE);

        ArrayList<IIngresso> ingressi = new ArrayList<>();
        ingressi.add(v1);
        ingressi.add(d1);

        for (int i = 0; i < ingressi.size(); i++) {
            IIngresso ingresso = ingressi.get(i);
            ingresso.checkIn();
        }

    }
}
