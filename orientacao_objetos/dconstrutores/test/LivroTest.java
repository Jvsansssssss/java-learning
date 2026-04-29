package dconstrutores.test;

import dconstrutores.dominio.Livro;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Sapiens: Uma Breve História da Humanidade", "Yuval Noah Harari", 464, "978-0062316097");
        Livro livro2 = new Livro("A Estrada", "Cormac McCarthy", 287);
        Livro livro3 = new Livro("O nome do vento");

        livro1.imprime();
        System.out.println("-------------------------------");

        livro2.imprime();
        System.out.println("-------------------------------");

        livro3.imprime();
        System.out.println("-------------------------------");
    }
}
