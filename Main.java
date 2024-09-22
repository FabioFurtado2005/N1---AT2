import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criação do fornecedor
        System.out.print("Digite o nome do fornecedor: ");
        String nomeFornecedor = sc.nextLine();

        System.out.print("Digite o CNPJ do fornecedor (14 dígitos): ");
        String cnpjFornecedor = sc.nextLine();

        Fornecedor fornecedor = new Fornecedor(nomeFornecedor, cnpjFornecedor);

        // Criação do produto
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.print("Digite a quantidade inicial em estoque: ");
        int quantidadeInicial = sc.nextInt();

        System.out.print("Digite o preço do produto: ");
        double precoProduto = sc.nextDouble();

        Produto produto = new Produto(nomeProduto, quantidadeInicial, precoProduto, fornecedor);

        // operação com estoque
        System.out.print("Digite a quantidade para aumentar o estoque: ");
        int quantidadeParaAumentar = sc.nextInt();
        produto.aumentarEstoque(quantidadeParaAumentar);

        System.out.print("Digite a quantidade para diminuir o estoque: ");
        int quantidadeParaDiminuir = sc.nextInt();

        System.out.print("Digite o limite de estoque baixo para aviso: ");
        int limiteEstoqueBaixo = sc.nextInt();
        produto.diminuirEstoque(quantidadeParaDiminuir, limiteEstoqueBaixo);

        sc.close();
    }
}