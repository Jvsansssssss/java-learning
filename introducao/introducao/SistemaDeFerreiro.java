package introducao;

public class SistemaDeFerreiro {
    public static void main(String[] args) {
        int nivelArma = 2;
        char tipoMinerio = 'd'; // B = Bronze; P = Prata; O = Ouro.
        double custoFinal = 0;

        switch (tipoMinerio){
            case 'B':
                custoFinal = 100;
                break;
            case 'P':
                custoFinal = 300;
                break;
            case 'O':
                custoFinal = 1000;

                break;
            default:
                System.out.println("Minério inválido");
                return;
        }

        if (nivelArma > 3 ) {
            custoFinal *= 1.5;
        }

        String mensagemStatus = custoFinal > 500 ? "Melhoria cara" : "Melhoria acessivel";

        System.out.println("O valor final foi de: R$" + String.format("%.2f", custoFinal));
        System.out.println(mensagemStatus);
    }
}
