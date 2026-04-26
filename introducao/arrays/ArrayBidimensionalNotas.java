package arrays;

public class ArrayBidimensionalNotas {
    public static void main(String[] args) {
        double[][] notasAlunos = new double[4][4];
        notasAlunos[0][0] = 7.5;
        notasAlunos[0][1] = 8.0;
        notasAlunos[0][2] = 9.0;
        notasAlunos[0][3] = 6.0;
        notasAlunos[1][0] = 5.0;
        notasAlunos[3][2] = 3.0;
        notasAlunos[2][1] = 2.6;

        for (int i = 0; i < notasAlunos.length; i++) {
            double soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }

            double media = soma / notasAlunos[i].length;
            System.out.println("Aluno: " + i + " - Média: " + media);
            if (media < 7) {
                System.out.println("Você reprovou!");
                System.out.println();
            } else {
                System.out.println("Você está aprovado!");
                System.out.println();
            }
        }
        int totalNotas = 0;
        double somaGeral = 0;
        for (double[] alunos : notasAlunos) {
            for (double nota : alunos) {
                somaGeral += nota;
                totalNotas++;
            }


        }
        double mediaGeral = somaGeral / totalNotas;
        System.out.println("Media da sala: " + String.format("%.2f", mediaGeral));
    }


}
