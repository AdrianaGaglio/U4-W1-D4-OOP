package it.epicode.esercizio_2;


public class Dirigente extends Dipendente {
    private TipoContratto tipoContratto = TipoContratto.DIRIGENTE;
    public Dirigente(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    public TipoContratto getTipoContratto() {
        return tipoContratto;
    }

    public void setTipoContratto(TipoContratto tipoContratto) {
        this.tipoContratto = tipoContratto;
    }

    @Override
    public double calculateSalary() {
        int extra = 0;
        if(this.getDipartimento() == Dipartimento.VENDITE || this.getDipartimento() == Dipartimento.AMMINISTRAZIONE) extra = 200;
        return this.getStipendio() * 1.5 + extra;
    }
}
