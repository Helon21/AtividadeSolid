package org.example.Exercicio4;

public class Faixa5 implements FaixaImposto{

    @Override
    public boolean seAplica(double salario){
        return salario > 4664.68;
    }

    @Override
    public double calculaImposto(double salario){
        return (salario * 0.275) - 869.36;
    }

}
