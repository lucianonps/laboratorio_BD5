package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class TrianguloTest {

    Triangulo triangulo = new Triangulo();

    @ParameterizedTest
    @CsvSource({
        "3, 4, 5, Triângulo Escaleno",  
        "5, 5, 3, Triângulo Isósceles", 
        "3, 3, 3, Triângulo Equilátero" 
    })

    public void validos(int lado1, int lado2, int lado3, String resultadoEsperado) {
        assertEquals(resultadoEsperado, triangulo.tipoTriangulo(lado1, lado2, lado3));
    }

    @ParameterizedTest
    @CsvSource({
        "0, 4, 5",     
        "-1, 5, 6",   
        "1, 2, 3",     
        "1, 1, 3",     
        "0, 0, 0"      
    })
    public void invalidos(int lado1, int lado2, int lado3) {
        assertEquals("Os valores informados não formam um triângulo.", triangulo.tipoTriangulo(lado1, lado2, lado3));
    }
    
}
