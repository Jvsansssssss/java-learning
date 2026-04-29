package eblocosdeinicializacao.test;

import eblocosdeinicializacao.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("Lamborghini");
        carro1.imprime();
        System.out.println("------------------");
        carro2.imprime();
    }
}
