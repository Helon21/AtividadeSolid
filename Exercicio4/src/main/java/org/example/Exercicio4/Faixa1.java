package org.example.Exercicio4;

public class Faixa1 implements FaixaImposto{

    @Override
    public boolean seAplica(double salario){
        return salario <= 1903.98;
    }

    @Override
    public double calculaImposto(double salario){
        return 0;
    }

}
