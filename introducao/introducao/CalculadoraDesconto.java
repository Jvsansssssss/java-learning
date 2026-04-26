package introducao;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        String produto = "Computador Gamer";
        double preco = 3000;
        int quantidade = 6;
        boolean promocao = true;

        double subtotal = preco * quantidade;
        double desconto = 0;

        if(promocao){
            desconto += subtotal * 0.1;
        }
        if(quantidade > 5){
            desconto +=  subtotal * 0.05;
        }
        double precoTotal = subtotal - desconto;
        System.out.println("----------------------");
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("----------------------");
        System.out.println("Subtotal: R$ " + String.format("%.2f", subtotal));
        System.out.println("Desconto: R$ " + String.format("%.2f", desconto));
        System.out.println("Total: R$ " + String.format("%.2f", precoTotal));
    }
}
