package it.epicode.esercizio_2;


import it.epicode.esercizio_3.IIngresso;
import it.epicode.esercizio_3.Volontario;

abstract public class Dipendente implements IIngresso {
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

    public double calculateSalary() {
        return this.getStipendio();
    }


    @Override
    public void checkIn() {
        System.out.println("L'utente dipendente ha effettuato l'ingresso");
    }
}
