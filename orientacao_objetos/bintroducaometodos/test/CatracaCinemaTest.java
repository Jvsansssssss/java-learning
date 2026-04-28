package bintroducaometodos.test;

import bintroducaometodos.dominio.CatracaCinema;

public class CatracaCinemaTest {
    public static void main(String[] args) {
        CatracaCinema cliente = new CatracaCinema();
        cliente.setIdade(14);
        cliente.liberarAcesso(10);

    }
}
