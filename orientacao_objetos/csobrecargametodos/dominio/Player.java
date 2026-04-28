package csobrecargametodos.dominio;

public class Player {
    private String nome;
    private String classe;
    private int nivel;
    private String servidor;

    public void setup(String nome, String classe, int nivel, String servidor){
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.servidor = servidor;
    }

    public void setup(String nome, String classe){
        this.setup(nome, classe, 1, "Brasil");
    }

    public void setup(String nome){
        this.setup(nome, "Aprendiz");
    }



    public void imprime(){
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua classe é: " + classe);
        System.out.println("Seu nível é: " + nivel);
        System.out.println("Seu servidor é: " + servidor);
    }
}
