package condicionais;

public class SistemaCombatePro {
    public static void main(String[] args) {
        double vida = 100.0;
        double ataque = 20.0;
        int esquiva = 50;
        boolean temEscudo = true;
        boolean estaAtordoado = false;

        if(vida > 80 && temEscudo){
            vida *= 0.9; // Reduz 10% da vida
        }
        else{
            vida *= 0.75; // Reduz 25% da vida
        }
        if(ataque > 15 || esquiva > 40){
            ataque += 5;
        }
        if(!estaAtordoado && vida < 40){
            ataque *= 0.5; // Ataque vai para metade
        }
        esquiva %= 7; // Esquiva é tirada com resto de 7

        System.out.println("Sua vida final é: " + vida);
        System.out.println("Seu ataque final é: " + ataque);
        System.out.println("Sua esquiva final é: " + esquiva);
    }
}
