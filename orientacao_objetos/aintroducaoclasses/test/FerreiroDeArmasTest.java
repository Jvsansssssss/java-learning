package aintroducaoclasses.test;

import aintroducaoclasses.dominio.FerreiroDeArmas;

public class FerreiroDeArmasTest {
    public static void main(String[] args) {
        FerreiroDeArmas armaTest01 = new FerreiroDeArmas("Excalibur", 100, "Espada Lendária");
        FerreiroDeArmas armaTest02 = new FerreiroDeArmas("Kusanagi", 170, "Katana Lendária");

        System.out.println("Arma: " + armaTest01.nome + " - Dano: " + armaTest01.dano + " - Tipo: " + armaTest01.tipo);
        System.out.println("Arma: " + armaTest02.nome + " - Dano: " + armaTest02.dano + " - Tipo: " + armaTest02.tipo);

    }
}
