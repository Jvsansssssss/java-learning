package bintroducaometodos.test;

import bintroducaometodos.dominio.Guerreiro;

public class GuerreiroTest {
    public static void main(String[] args) {
        Guerreiro mana = new Guerreiro();
        mana.setMana(0);
        System.out.println("Mana atual: " + mana.getMana());
        mana.ManaStatus();

    }
}
