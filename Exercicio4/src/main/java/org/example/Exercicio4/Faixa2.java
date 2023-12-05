package org.example.Exercicio4;

public class Faixa2 implements FaixaImposto{

        @Override
        public boolean seAplica(double salario){
            return salario > 1903.98 && salario <= 2826.65;
        }

        @Override
        public double calculaImposto(double salario){
            return (salario * 0.075) - 142.80;
        }
}
