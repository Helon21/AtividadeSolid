package org.example;

import org.example.Exercicio3.DiaDaSemanaFr;
import org.example.Exercicio3.DiaDaSemanaPtBr;
import org.example.Exercicio3.Semana;

public class Main {
    public static void main(String[] args) {
        Semana semanaPtBr = new Semana(new DiaDaSemanaPtBr());
        Semana semanaFr = new Semana(new DiaDaSemanaFr());

        semanaPtBr.imprimeDia(5);
        semanaFr.imprimeDia(4);
    }
}