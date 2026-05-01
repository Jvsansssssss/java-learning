package fmodificadoresestatico.test;

import fmodificadoresestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Lamborghini", 260);
        Carro carro2 = new Carro("BMW", 300);
        Carro carro3 = new Carro("Ferrari", 320);
        Carro.velocidadeLimite = 180;
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
