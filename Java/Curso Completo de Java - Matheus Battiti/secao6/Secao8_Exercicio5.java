import java.util.Scanner;

public class Secao8_Exercicio5 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma idade: ");
        int idade = scanner.nextInt();

        verificarIdade(idade);
    }

    // Funções

    public static void verificarIdade(int idade) {
        
        if (idade < 18) {
            System.out.println("Acesso negado ");
            System.exit(0);
        }

        System.out.println("Acesso permitido");

    }
}
