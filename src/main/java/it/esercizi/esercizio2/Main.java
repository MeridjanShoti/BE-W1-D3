package it.esercizi.esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero possibilmente di 10 cifre");
        String numero = scanner.next();
        Sim sim1 = new Sim(numero);
        System.out.println("inserisci il credito");
        double credito = scanner.nextDouble();
        sim1.setCredito(credito);
        sim1.stampaSim();

    }
}
