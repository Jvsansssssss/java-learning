package aintroducaoclasses.test;

import aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 15;
        estudante.nome = "Julia";
        estudante.sexo = 'F';

        System.out.println("Estudante: " + estudante.nome + " - Idade: " + estudante.idade + " - Sexo: " + estudante.sexo);
    }
}
