package academy.devdojo.maratona_java.introducao;

public class Operadores {
    public static void main(String[] args) {
        double ingresso = 50.0;
        boolean estudante = false;
        int idade = 19;
        boolean hojeETerca = true;

        if (idade < 5) {
            ingresso = 0;
        }
        else if(estudante || idade < 18){
            ingresso = ingresso * 0.5;
        }
        else if(hojeETerca && !estudante){
            ingresso = ingresso * 0.5;
        }
        System.out.println("Você ira pagar: R$" + ingresso);
    }
}
