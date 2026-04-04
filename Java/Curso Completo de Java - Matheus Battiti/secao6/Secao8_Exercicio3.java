import java.util.Scanner;

public class Secao8_Exercicio3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numeroDigitado = scanner.nextInt();

        scanner.close();

        System.out.println(verificarParidade(numeroDigitado));

    }

    // Funções

    public static String verificarParidade(int numeroDigitado) {
        if (numeroDigitado % 2 == 0) {
            return "O numero " + numeroDigitado + "é par!";
        } else {
            return "O número" + numeroDigitado + " NÃO é par!" ;
        }
    }
}
