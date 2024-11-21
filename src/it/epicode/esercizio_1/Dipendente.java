package it.epicode.esercizio_1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dipendente {
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return this.matricola;
    }

    public double getStipendio() {
        return this.stipendio;
    }

    public Dipartimento getDipartimento() {
        return this.dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = Dipartimento.valueOf(dipartimento);
    }

}
