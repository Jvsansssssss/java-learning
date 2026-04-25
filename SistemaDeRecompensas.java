package academy.devdojo.maratona_java.introducao;

public class SistemaDeRecompensas {
    public static void main(String[] args) {
        double recompensa = 1000.0;
        int dificuldade = 4; // dificuldade de 1 a 5
        boolean temPasse = true;
        double bonusDificuldade =  dificuldade >= 4 ? 500 : 250;
        String mensagemFinal = temPasse ? "Recompensa Premium Ativa" : "Recompensa Padrão";
        recompensa += bonusDificuldade;
        if(temPasse){
            recompensa*=2;
        }

        System.out.println(mensagemFinal);
        System.out.println("Você ira receber: R$" + String.format("%.2f", recompensa));


    }
}
