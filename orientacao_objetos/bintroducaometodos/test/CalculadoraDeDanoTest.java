package bintroducaometodos.test;

import bintroducaometodos.dominio.CalculadoraDeDano;

public class CalculadoraDeDanoTest {
    public static void main(String[] args) {
        CalculadoraDeDano calc = new CalculadoraDeDano();
        double resultado = calc.calcMediaDano(6.23, 54, 123);
        System.out.println("A média do dano das 3 armas é: " + String.format("%.2f", resultado));
    }
}
