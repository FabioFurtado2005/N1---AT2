public class Produto {
    private String nome;
    private int quantidadeEmEstoque;
    private double preco;
    private Fornecedor fornecedor;


    // construtor completo
    public Produto(String nome, int quantidadeEmEstoque, double preco, Fornecedor fornecedor) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    // metodo de aumentar estoque
    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmEstoque += quantidade;
            System.out.println("Estoque aumentado! Quantidade atual: " + this.quantidadeEmEstoque);
        } else {
            System.out.println("Quantidade inválida!");
        }
    }

    // metodo de diminuir estoque
    public void diminuirEstoque(int quantidade, int limiteEstoqueBaixo) {
        if (quantidade >= 0 && quantidade <= this.quantidadeEmEstoque) {
            this.quantidadeEmEstoque -= quantidade;
            System.out.println("Estoque diminuído! Quantidade atual: " + this.quantidadeEmEstoque);
            if (this.quantidadeEmEstoque < limiteEstoqueBaixo) {
                System.out.println("Aviso: Estoque abaixo do limite mínimo!");
            }
        } else {
            System.out.println("Quantidade inválida ou insuficiente em estoque!");
        }
    }
}
