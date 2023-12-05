package org.example;

import org.example.exercicio2.Circulo;
import org.example.exercicio2.FormaGeometrica;
import org.example.exercicio2.Quadrado;
import org.example.exercicio2.Triangulo;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica triangulo = new Triangulo(10, 10);

        FormaGeometrica quadrado = new Quadrado(15, 20);

        FormaGeometrica circulo = new Circulo(15);

        System.out.println("Area do triangulo: " + triangulo.area());

        System.out.println("Area do quadrado: " + quadrado.area());

        System.out.println("Area do circulo: " + circulo.area());
    }
}