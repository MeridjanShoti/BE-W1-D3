package it.esercizi.esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero possibilmente di 10 cifre");
        String numero = scanner.next();
        Sim sim1 = new Sim(numero);
        sim1.setCredito(4.56);
        sim1.stampaSim();

    }
}
