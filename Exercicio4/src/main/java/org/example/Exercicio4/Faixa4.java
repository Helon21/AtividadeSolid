package org.example.Exercicio4;

public class Faixa4 implements FaixaImposto{

        @Override
        public boolean seAplica(double salario){
            return salario > 3751.05 && salario <= 4664.68;
        }

        @Override
        public double calculaImposto(double salario){
            return (salario * 0.225) - 636.13;
        }

}
