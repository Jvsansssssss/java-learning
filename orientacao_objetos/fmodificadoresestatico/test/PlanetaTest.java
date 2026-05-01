package fmodificadoresestatico.test;

import fmodificadoresestatico.dominio.Planeta;

public class PlanetaTest {
    public static void main(String[] args) {
        Planeta terra = new Planeta("Terra", 12714);
        Planeta marte = new Planeta("Marte", 6792);
        Planeta jupiter = new Planeta("Jupiter", 142984);
        terra.imprime();
        marte.imprime();
        jupiter.imprime();
    }
}
