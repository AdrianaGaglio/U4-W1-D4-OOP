package it.epicode.esercizio_3;

public class Volontario implements IIngresso {
    private String nome;
    private int eta;
    private String CV;

    public Volontario(String nome, int eta, String CV) {
        this.nome = nome;
        this.eta = eta;
        this.CV = CV;
    }

    public String getNome() {
        return this.nome;
    }
    public int getEta() {
        return this.eta;
    }
    public String getCV() {
        return this.CV;
    }


    @Override
    public void checkIn() {
        System.out.println("L'utente volontario ha ha effettuato l'ingresso");
    }
}
