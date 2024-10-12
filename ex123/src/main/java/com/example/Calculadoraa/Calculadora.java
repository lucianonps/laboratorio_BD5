package com.example.Calculadoraa;

public class Calculadora {

    public static double calcular(Funcionario funcionario) {
        double salarioBase = funcionario.getSalarioBase();
        Cargo cargo = funcionario.getCargo();
        
        switch (cargo) {
            case Desenvolvedor:
                return salarioBase >= 3000 ? salarioBase * 0.8 : salarioBase * 0.9;
            case DBA:
            case Testador:
                return salarioBase >= 2000 ? salarioBase * 0.75 : salarioBase * 0.85;
            case Gerente:
                return salarioBase >= 5000 ? salarioBase * 0.7 : salarioBase * 0.8;
            default:
                throw new IllegalArgumentException("Cargo desconhecido");
        }
    }
    
}
