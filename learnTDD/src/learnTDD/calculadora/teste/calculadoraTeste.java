package learnTDD.calculadora.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class calculadoraTeste {

    @Test

    public void deveriaSomarDoisValoresPassados() throws Exception {

        int valorA = 1;
        int valorB = 2;

        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(valorA, valorB);

        assertEquals(3, soma);

    }

    @Test
    public void deveriaSubtrairDoisValoresPassados() throws Exception {

        int valorA = 10;
        int valorB = 2;

        Calculadora calculadora = new Calculadora();
        int subtracao = calculadora.subtracao(valorA, valorB);

        assertEquals(8, subtracao);

    }

    @Test
    public void deveriamultiplicarDoisValoresPassados() throws Exception {

        int valorA = 5;
        int valorB = 7;

        Calculadora calculadora = new Calculadora();
        int multiplicacao = calculadora.multiplicacao(valorA, valorB);

        assertEquals(35, multiplicacao);

    }

    @Test
    public void deveriSomarTresValoresPassados() throws Exception {

        int valorA = 5;
        int valorB = 7;
        int valorC = 2;

        Calculadora calculadora = new Calculadora();
        int soma3 = calculadora.soma3(valorA, valorB, valorC);

        assertEquals(14, soma3);

    }

    @Test
    public void verAnoMaiorQue2024() throws Exception {
        int ano = 2000; // Defina o ano para verificar

        Calculadora calculadora = new Calculadora();

        // Verifica se o ano não é maior que 2024
        assertFalse(calculadora.anoMaiorQue2024(ano), "O ano não deve ser maior que 2024");

    }

    @Test
    public void verNumMaior() throws Exception {

        int val1 = 5;
        int val2 = 2;

        Calculadora calculadora = new Calculadora();
        int valores = calculadora.valores(val1, val2);

        assertEquals(5, valores);

    }
}
