import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) {



        // 1 - testando scanner

        Scanner scanner = new Scanner(System.in);

        // Mensagem para usuario entender o que precisa digitar
        System.out.println("Digite o seu nome: ");

        //  Resgata o valor do terminal
        String nome = scanner.nextLine();

        // Exibe o valor
        System.out.println("Olá " + nome + "!");

        // nextInt

        // Pulando uma linha do Programa anterior.
        System.out.println();

        // Mensagem pedindo numero ao usuário.
        System.out.println("Digite um numero: ");

        // Resgata o numero digitado no terminal.
        int numero = scanner.nextInt();

        // Exibindo o numero na tela.
        System.out.println("O numero digitado foi: " + numero);



        // 2 - Problema do nextLine

        System.out.println("Digite um número: ");

        // Depois de usar um nextInt() se for ter mais algum é necessário usar o scanner.nextLine() antes do proximo
        int n = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite um texto: ");

        String txt = scanner.nextLine();

        System.out.println("Os dados são, n = " + n + " e txt = " + txt );

        // Fechamento do scanner, para evitar memory leak

        scanner.close();

    }
}