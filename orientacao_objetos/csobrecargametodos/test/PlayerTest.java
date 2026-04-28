package csobrecargametodos.test;

import csobrecargametodos.dominio.Player;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player();
        player.setup("Raí");
        player.imprime();
        System.out.println("-----------");
        player.setup("João", "Clérigo");
        player.imprime();
        System.out.println("-----------");
        player.setup("Julia", "Mago", 10, "Brasil");
        player.imprime();

    }
}
