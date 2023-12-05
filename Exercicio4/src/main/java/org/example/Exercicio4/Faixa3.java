package org.example.Exercicio4;

public class Faixa3 implements FaixaImposto{

        @Override
        public boolean seAplica(double salario){
            return salario > 2826.65 && salario <= 3751.05;
        }

        @Override
        public double calculaImposto(double salario){
            return (salario * 0.15) - 354.80;
        }

}
