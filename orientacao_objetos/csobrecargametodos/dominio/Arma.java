package csobrecargametodos.dominio;

public class Arma{
    private String nome;
    private int dano;
    private String raridade;

    public void forjar(String nome) {
        this.nome = nome;
        this.dano = 5;
        this.raridade = "Comum";
    }

    public void forjar(String nome, double dano) {
        this.forjar(nome);
        this.dano = (int) (dano);
        if (dano > 20) {
            this.raridade = "Rara";
        }
    }

    public void forjar(String nome, double dano, String raridade) {
        this.forjar(nome, dano);
        this.raridade = raridade;
        if (raridade.equals("Lendária")) {
            this.dano =  (int) (dano * 1.5);
        }
    }
    public void imprime(){
        System.out.println("O nome da sua arma é: " + this.nome);
        System.out.println("A raridade da sua arma é: " + this.raridade);
        System.out.println("O dano da sua arma é: " + this.dano);
    }
}
