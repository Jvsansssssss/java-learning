package aintroducaoclasses.test;

import aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca", "Volkswagen", 1950);
        Carro carro2 = new Carro("Chevette", "Chevrolet", 1992);
        Carro carro3 = new Carro("iX3", "BMW", 2026);

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
