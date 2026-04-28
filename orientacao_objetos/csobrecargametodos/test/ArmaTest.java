package csobrecargametodos.test;

import csobrecargametodos.dominio.Arma;

public class ArmaTest{
    public static void main(String[] args) {
        Arma arma1 = new Arma();
        arma1.forjar("Excalibur");
        arma1.imprime();
        System.out.println("--------------------------------");
        arma1.forjar("Goujian", 20);
        arma1.imprime();
        System.out.println("--------------------------------");
        arma1.forjar("Kusanagi", 100, "Lendária");
        arma1.imprime();
    }
}
