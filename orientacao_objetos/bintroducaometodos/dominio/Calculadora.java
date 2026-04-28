package bintroducaometodos.dominio;

public class Calculadora {
    public void soma(){
        System.out.println(10 + 14);
    }
    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }
        System.out.println(soma);
    }
    public void somaVarAgs(int... numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
            
        }
        System.out.println(soma);
    }
}
