package model;

public class Dipendente {

    private String nome;
	private String ruolo;
	private int matricola;
    private static int contatore = 1;

    public Dipendente(String nome) {
        this.nome = nome;
    }
}
