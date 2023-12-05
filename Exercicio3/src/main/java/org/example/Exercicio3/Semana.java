package org.example.Exercicio3;

public class Semana {

    private DiaDaSemana diaDaSemana;

    public Semana(DiaDaSemana diaDaSemana){
        this.diaDaSemana = diaDaSemana;
    }

    public void imprimeDia(int dia){
        diaDaSemana.imprimeDia(dia);
    }

}
