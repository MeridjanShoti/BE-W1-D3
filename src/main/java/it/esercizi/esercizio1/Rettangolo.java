package it.esercizi.esercizio1;

public class Rettangolo {

    private int larghezza;
    private int altezza;
    public Rettangolo(int larghezza, int altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
    }
    public int calcolaPerimetro(){
        return ((this.larghezza*2)+(this.altezza*2));
    }
    public int calcolaArea(){
        return (this.larghezza*this.altezza);
    }
}

