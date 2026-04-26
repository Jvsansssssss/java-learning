package arrays;

public class ReajusteSalarial {
    public static void main(String[] args) {
        String[] funcionarios = {"Raphael", "Raí", "João", "Julia"};
        double[] salarios = {2500, 4322, 4653, 5000};
        for(int i = 0; i < funcionarios.length; i++){
            if(salarios[i] < 3000){
                salarios[i] *= 1.1;
            }
            System.out.println("Funcionário: " + funcionarios[i] + " - Salário: " + String.format("%.2f", salarios[i]));
        }
    }
}
