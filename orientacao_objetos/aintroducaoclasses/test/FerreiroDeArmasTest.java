package aintroducaoclasses.test;

import aintroducaoclasses.dominio.FerreiroDeArmas;

public class FerreiroDeArmasTest {
    public static void main(String[] args) {
        FerreiroDeArmas armaTest01 = new FerreiroDeArmas();
        FerreiroDeArmas armaTest02 = new FerreiroDeArmas();
        armaTest01.nome = "Excalibur";
        armaTest01.dano = 100;
        armaTest01.tipo = "Espada Lendária";
        armaTest02.nome = "Kusanagi";
        armaTest02.dano = 170;
        armaTest02.tipo = "Katana Lendária";

        System.out.println("Arma: " + armaTest01.nome + " - Dano: " + armaTest01.dano + " - Tipo: " + armaTest01.tipo);
        System.out.println("Arma: " + armaTest02.nome + " - Dano: " + armaTest02.dano + " - Tipo: " + armaTest02.tipo);

    }
}
