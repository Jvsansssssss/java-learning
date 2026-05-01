package fmodificadoresestatico.dominio;

public class Planeta {
    private final String nome;
    private final double tamanho;
    private static String galaxia;

    static{
        System.out.println("Carregando galaxia....");
        galaxia = "Via láctea";
        System.out.println("Você está na: " + galaxia);
    }
    {
        System.out.println("--- Calculando a gravidade do planeta... ---");
    }

    public Planeta(String nome, double tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
        System.out.println("Planeta " + this.nome + " foi criado!");
    }

    public void imprime(){
        System.out.println(this.nome + ":");
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Se localiza na: " + Planeta.galaxia);
        System.out.println("-------------------");
    }
}
