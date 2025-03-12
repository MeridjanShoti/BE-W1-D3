package it.esercizi.esercizio3;

import lombok.Data;

@Data
public class Carrello {
    private int cliente;
    private Articolo[] articoli;
    private int totale;
    private void stampaCarrello(){
        System.out.println("Cliente:");

    }
}
