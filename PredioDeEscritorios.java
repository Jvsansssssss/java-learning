package academy.devdojo.maratona_java.introducao;

public class PredioDeEscritorios {
    public static void main(String[] args) {
        int[][][] cond = new int[2][3][4];
        cond[1][1][3] = 5;
        cond[0][2][0] = 12;
        for (int i = 0; i < cond.length; i++) {
            for (int j = 0; j < cond[i].length; j++) {
                for (int k = 0; k < cond[i][j].length; k++) {
                    System.out.println("Bl: " + i + " - Andar: " + j + " - Sala: " + k + " - Pessoas: " + cond[i][j][k]);

                }

            }

        }
        int totalPessoas = 0;

        for (int[][] bloco : cond) {
            for (int[] andar : bloco) {
                for (int sala : andar) {
                    totalPessoas += sala;
                }
            }
        }
        System.out.println("Quantidade de pessoa nos prédios: " + totalPessoas);
    }
}
