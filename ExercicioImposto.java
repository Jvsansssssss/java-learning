package academy.devdojo.maratona_java.introducao;

public class ExercicioImposto {
    public static void main(String[] args) {
        String nome = "Seu geraldo";
        double salario = 34712;
        double percentual = 0;

        if(salario < 35612) {
            percentual = 0;
        }
        else if (salario <= 68507){
            percentual = 9.7;
        }
        else{
            percentual = 37.35;
        }
        double imposto = salario * (percentual / 100);

        System.out.println("Seu nome é: " + nome);
        System.out.println("Salario total: R$" + String.format("%.2f", salario));
        System.out.println("--------------------------------------------------");
        System.out.println("Imposto de: " + percentual + "%, tirando: R$"+ String.format("%.2f", imposto));
        System.out.println("Salário pós imposto: R$" + String.format("%.2f", salario - imposto));

    }
}
