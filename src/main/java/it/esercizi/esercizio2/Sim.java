package it.esercizi.esercizio2;

public class Sim {
    private String numero;
    private double credito = 0;
    Chiamata[] chiamate = new Chiamata[5];
    public Sim(String numero){
        this.numero= "+39/" + numero;
        for(int i =0; i<5; i++){
            this.chiamate[i] = new Chiamata();
        }
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    public void stampaSim (){
        System.out.println("DATI SIM:");
        System.out.println("numero: " + this.numero);
        System.out.println("credito: " + credito + " €");
        System.out.println("CHIAMATE:");
        for (int i = 0; i< chiamate.length; i++){
            System.out.println("Chiamata " + (i +1));
            System.out.println("Numero: " + chiamate[i].getNumero());
            System.out.println("Minuti: " + chiamate[i].getMinuti());
        }

    }
}
