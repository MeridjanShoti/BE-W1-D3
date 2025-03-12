package it.esercizi.esercizio1;

import java.util.Scanner;

public class Main {
    static void stampaRettangolo(Rettangolo a){
        System.out.println("area: " + a.calcolaArea());
        System.out.println("perimetro: " + a.calcolaPerimetro());
    }
    static void stampaDueRettangoli(Rettangolo a, Rettangolo b){

        int sommaPerimetro = a.calcolaPerimetro()+b.calcolaPerimetro();
        int sommaArea = a.calcolaArea()+ b.calcolaArea();
        System.out.println("STAMPA DUE RETTANGOLI");
        System.out.println("- Rettangolo 1");
        stampaRettangolo(a);
        System.out.println("- Rettangolo 2");
        stampaRettangolo(b);
        System.out.println("Somma aree: " +sommaArea);
        System.out.println("somma perimetri: " + sommaPerimetro);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci l'altezza del primo rettangolo");
        int altezza1= scanner.nextInt();
        System.out.println("inserisci la larghezza del primo rettangolo");
        int larghezza1= scanner.nextInt();
        Rettangolo rettangolo1 = new Rettangolo(larghezza1, altezza1);
        System.out.println("- Rettangolo 1");
        stampaRettangolo(rettangolo1);
        System.out.println("inserisci l'altezza del secondo rettangolo");
        int altezza2 = scanner.nextInt();
        System.out.println("inserisci la larghezza del secondo rettangolo");
        int larghezza2 = scanner.nextInt();
        Rettangolo rettangolo2 = new Rettangolo(larghezza2, altezza2);
        System.out.println("-Rettangolo 2");
        stampaRettangolo(rettangolo2);
        stampaDueRettangoli(rettangolo1,rettangolo2);
    }
}
