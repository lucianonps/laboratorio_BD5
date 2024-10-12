package com.example.Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.example.Calculadoraa.Calculadora;
import com.example.Calculadoraa.Cargo;
import com.example.Calculadoraa.Funcionario;

public class CalculadoraTest {

    @ParameterizedTest
    @CsvSource({
        "'João', 'joao@example.com', 2500.0, 'Desenvolvedor', 2250.0",
        "'Maria', 'maria@example.com', 4000.0, 'Desenvolvedor', 3200.0",
        "'Pedro', 'pedro@example.com', 1500.0, 'DBA', 1275.0",
        "'Ana', 'ana@example.com', 2500.0, 'DBA', 1875.0",
        "'Carlos', 'carlos@example.com', 4500.0, 'Gerente', 3600.0",
        "'Roberta', 'roberta@example.com', 6000.0, 'Gerente', 4200.0"
    })

    public void deveCalcularSalarioLiquido(
        String nome, 
        String email, 
        double salarioBase, 
        String cargoStr, 
        double salarioEsperado
    ) {
        Cargo cargo = Cargo.valueOf(cargoStr);
        Funcionario funcionario = new Funcionario(cargo, email, nome, salarioBase);
        double salarioLiquido = Calculadora.calcular(funcionario);
        assertEquals(salarioEsperado, salarioLiquido, 0.001);
    }
    
}
