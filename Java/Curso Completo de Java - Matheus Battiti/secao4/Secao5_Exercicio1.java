package secao4;

import java.util.Scanner;

public class Secao5_Exercicio1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do seu produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite o valor do Produto: ");
        double valorProduto = scanner.nextDouble();

        if (valorProduto <= 0) {
            System.out.println("Produto inválido ou nao esta no range aceitavel.");
            return;
        }
        
        System.out.println("O Produto digitado foi " + nomeProduto);
        System.out.println("O Valor do produto digitado foi: " + valorProduto);

        if (valorProduto >= 1 && valorProduto < 50) {
            System.out.println("Produto categorizado como: Barato");
        } else if (valorProduto >= 50 && valorProduto <= 100 ) {
            System.out.println("Produto categorizado como: Medio");
        } else {
            System.out.println("Produto categorizado como: Caro");
        }

        scanner.close();
    }
    
}
