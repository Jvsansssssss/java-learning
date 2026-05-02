package fmodificadoresestatico.dominio;

public class Vaga {
    private final int numeroVaga;
    private static String nomeEstacionamento;
    private static int vagasOcupadas;
    static {
        nomeEstacionamento = "Estacionamento do seu zé";
    }
    {
        vagasOcupadas++;
    }

    public Vaga(int numeroVaga){
        this.numeroVaga = numeroVaga;
    }

    public void imprimeInfo(){
        System.out.println("Você está no: " + nomeEstacionamento);
        System.out.println("Você está na vaga " + this.numeroVaga);
        System.out.println("Tem um total de " + vagasOcupadas + " vagas ocupadas");
        System.out.println("---------------------------");
    }
}
