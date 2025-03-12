package it.esercizi.esercizio2;

public class Chiamata {
    private String numero = "+39/3" + String.valueOf((int) (Math.random()*100000000));
    private int minuti = (int) (Math.random()*15);

    public int getMinuti() {
        return minuti;
    }

    public String getNumero() {
        return numero;
    }
}
