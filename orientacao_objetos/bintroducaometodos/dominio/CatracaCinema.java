package bintroducaometodos.dominio;

public class CatracaCinema {
    private int idade;

    public void setIdade(int idade){
        if(idade > 0 && idade < 120){
            System.out.println("Idade confirmada");
            this.idade = idade;
        }else{
            System.out.println("Digite uma idade valida.");
        }
    }
    public void liberarAcesso(int classificacaoFilme){
        if(idade >= classificacaoFilme){
            System.out.println("Acesso liberado, bom filme.");
        }else{
            System.out.println("Você nao tem idade suficiente para assistir o filme");
        }
    }
}
