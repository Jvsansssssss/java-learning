package introducao;

public class ControleDeEstoque {
    public static void main(String[] args) {
        String[] produtos = new String[]{"Mouse" ,"Teclado", "Computador", "Mousepad"};
        int[] estoque = new int[]{53, 123, 4, 153};
        for (int i = 0; i < produtos.length; i++){
            System.out.println("Produto: " + produtos[i] + " - Estoque: " + estoque[i]);
            System.out.println();
        }
        int[] precos = new int[]{200, 320, 3000, 100};
        double soma = 0;
        for(int num : precos){
            soma += num;
        }
        System.out.println("Soma total: R$" + String.format("%.2f", soma));
    }
}
