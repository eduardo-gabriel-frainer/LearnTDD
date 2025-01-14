package learnTDD.calculadora.teste;

public class Calculadora {
    public int soma(int valorA, int valorB) {
        return valorA + valorB;
    }

    public int subtracao(int valorA, int valorB) {
        return valorA - valorB;
    }

    public int multiplicacao(int valorA, int valorB) {
        return valorA * valorB;
    }

    public int soma3(int valorA, int valorB, int valorC) {
        return valorA + valorB + valorC;
    }

    public boolean anoMaiorQue2024(int ano) {
        return ano > 2024;// true
    }

    public int valores(int val1, int val2) {

        if (val1 > val2) {

            return val1;
        } 
        else {
            return val2;
        }

    }

    
}
