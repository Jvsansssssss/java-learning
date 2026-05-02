package fmodificadoresestatico.test;

import fmodificadoresestatico.dominio.Vaga;

public class VagaTest {
    public static void main(String[] args) {
        Vaga vaga1 = new Vaga(1);
        Vaga vaga2 = new Vaga(9);
        Vaga vaga3 = new Vaga(4);
        vaga1.imprimeInfo();
        vaga2.imprimeInfo();
        vaga3.imprimeInfo();
    }
}
