package it.esercizi.esercizio3;

import lombok.Data;

import java.util.Date;

@Data
public class Cliente {
    private int codiceCliente = (int) (Math.random()*10000);
    private String nome;
    private String cognome;
    private String email;
    private Date data;
Cliente(String nome, String cognome, String email){
    this.nome = nome;
    this.cognome = cognome;
    this.email = email;
    this.data = new Date();
}
public void stampaCliente(){

}
}

