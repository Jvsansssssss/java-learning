package aintroducaoclasses.test;

import aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.nome = "Fusca";
        carro1.modelo = "Volkswagen";
        carro1.ano = 1950;

        carro2.nome = "Chevette";
        carro2.modelo = "Chevrolet";
        carro2.ano = 1992;

        carro3.nome = "iX3";
        carro3.modelo = "BMW";
        carro3.ano = 2026;

        Carro[] carros = {carro1, carro2, carro3};

        for(Carro carro : carros){
            System.out.println("Nome: " + carro.nome + " - Modelo: " + carro.modelo + " - Ano: " + carro.ano );
            if(carro.ano < 1990){
                System.out.println("Esse é um clássico!");
            }
            System.out.println();
                }
            }
        }
