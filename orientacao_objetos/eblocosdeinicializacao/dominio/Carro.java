package eblocosdeinicializacao.dominio;

public class Carro {
    private String nome;
    private String[] pecas;

    {
        System.out.println("--- Executando Bloco de Inicialização (Montando Peças) ---");
        pecas = new String[5];
        for (int i = 0; i < pecas.length; i++) {
            pecas[i] = String.valueOf(i + 1);
        }
    }

    public Carro(String nome) {
        this.nome = nome;
        System.out.println("Executando Construtor com Nome");
    }

    public Carro() {
        System.out.println("Executando Construtor Vazio");
    }

    public void imprime() {
        System.out.println("Nome do Carro: " + (this.nome == null ? "Sem nome" : this.nome));
        for (int i = 0; i < pecas.length; i++) {
            System.out.println((i + 1) + "° peça: " + pecas[i]);
        }
        System.out.println("---------------------------------");
    }
}