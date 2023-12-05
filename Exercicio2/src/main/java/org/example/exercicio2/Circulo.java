package org.example.exercicio2;

public class Circulo extends FormaGeometrica{

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(raio, 2);
    }


}
