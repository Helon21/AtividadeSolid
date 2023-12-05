package org.example.exercicio2;

public class Quadrado extends FormaGeometrica{

    private double base;
    private double altura;

    public Quadrado(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

}
