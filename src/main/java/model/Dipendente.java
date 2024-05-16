package model;

public abstract class Dipendente {

    private String nome;
	private String ruolo;
	private int matricola;
    private static int contatore = 1;
    private double stipendio;

    public Dipendente(String nome) {
        this.nome = nome;
        this.matricola = contatore++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    @Override
    public String toString() {
        return "Dipendente [nome=" + nome +
                ", ruolo=" + ruolo +
                ", matricola=" + matricola +
                ", stipendio=" + stipendio
				+ "]";
    }

    public abstract void calcolaStipendio();

}
