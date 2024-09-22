import java.util.Scanner;

public class Fornecedor {
    private String nome;
    private String cnpj;

    // construtor sobrecarregado
    public Fornecedor(String nome, String cnpj) {
        this.nome = nome;
        setCnpj(cnpj);
    }

    // setter do CNPJ com validação if-else
    public void setCnpj(String cnpj) {
        Scanner sc = new Scanner(System.in);
        // valida o CNPJ
        if (validaCnpj(cnpj)) {
            this.cnpj = cnpj;
        } else {
            // loop de solicitar um novo input
            while (!validaCnpj(cnpj)) {
                System.out.println("CNPJ inválido! Tente novamente.");
                cnpj = sc.nextLine(); // recebe outro CNPJ
            }
            this.cnpj = cnpj; // atribui o CNPJ válido
        }
    }

    // metodo de validar cnpj
    public boolean validaCnpj(String cnpj) {
        // \\d{14} verifica o CNPJ tem exatamente 14 dígitos
        return cnpj != null && cnpj.matches("\\d{14}");
    }
}