package com.example;

import java.util.Scanner;


public class Triangulo {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor do primeiro lado ?");
        int lado1 = scanner.nextInt();

        System.out.println("digite o valor do segundo lado ?");
        int lado2 = scanner.nextInt();

        System.out.println("digite o valor do terceiro lado ?");
        int lado3 = scanner.nextInt();
        
        Triangulo triangulo = new Triangulo();
        String resultado = triangulo.tipoTriangulo(lado1, lado2, lado3);

        System.out.println(resultado);

        scanner.close();


    }





    public String tipoTriangulo(int lado1, int lado2, int lado3) {
        if (!TrianguloValido(lado1, lado2, lado3)) {
            return "Os valores informados não formam um triângulo.";
        }

        if (lado1 == lado2 && lado2 == lado3) {
            return "Triângulo Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "Triângulo Isósceles";
        } else {
            return "Triângulo Escaleno";
        }
    }

    // Verifica se os lados podem formar um triângulo
    private boolean TrianguloValido(int lado1, int lado2, int lado3) {
        return (lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2);
    }

    
}
