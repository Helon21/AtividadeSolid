package org.example;

import org.example.Exercicio4.*;

import java.util.List;

public class Main {

        public static void main(String[] args) {
            List<FaixaImposto> faixas = List.of(
                    new Faixa1(),
                    new Faixa2(),
                    new Faixa3(),
                    new Faixa4(),
                    new Faixa5()
            );

            double salario = 2886.65;

            for (FaixaImposto faixa : faixas) {
                if (faixa.seAplica(salario)) {
                    System.out.println(faixa.calculaImposto(salario));
                    break;
                }
            }
        }
}