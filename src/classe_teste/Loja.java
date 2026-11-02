import java.util.Scanner;

class Produto {
    String titulo;
    String descricao;
    double precoUnitario;
    int qtdEstoque;
}

public class Loja {
    public static Scanner input = new Scanner(System.in);
    public static void main (String[] args) {
        System.out.println("======== Bem vindo ao Cadastro de Produtos========");
        Produto produto1 = cadastroProduto(1);
        Produto produto2 = cadastroProduto(2);
        System.out.println("=========PRODUTOS CADASTRADOS=========");
        imprimirProduto(produto1, 1);
        imprimirProduto(produto2, 2);

    }

    public static Produto cadastroProduto (int i){
        Produto produto = new Produto();
        System.out.printf("\nCADASTRO DO PRODUTO %d\n", i);
        System.out.print("Escolha um titulo: ");
        produto.titulo = input.nextLine();
        System.out.print("Descreva o produto: ");
        produto.descricao = input.nextLine();
        System.out.print("Digite o Valor do produto (unidade): ");
        produto.precoUnitario = input.nextDouble();
        System.out.print("Digite a quantidade no Estoque: ");
        produto.qtdEstoque = input.nextInt();
        input.nextLine();

        return produto;
    }

    public static void imprimirProduto(Produto produto, int i) {
        System.out.printf("\nPRODUTO %d:", i);
        System.out.printf("\nTítulo: %s\n  Descrição: %s\n  Preço Unitário: %.2f\n  Quantidade no Estoque: %d\n", produto.titulo, produto.descricao, produto.precoUnitario, produto.qtdEstoque);
        
    }

    
}
