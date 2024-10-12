package com.example.Calculadoraa;



public final class App {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(Cargo.Desenvolvedor, "danilo@p.com","Danilo", 3001.0);
        double salario = Calculadora.calcular(funcionario);
        System.err.println(salario);

    }

    
}
