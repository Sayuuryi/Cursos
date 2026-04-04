import java.util.Scanner;

public class Secao8_Exercicio2 {
    
    public static void main(String[] args) {

        // Função principal calcularFatorial
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número para ser calculado o fatorial: ");
        long numero = scanner.nextLong();

        long resultado1 = calcularFatorial(numero);
        System.out.println("Fatorial com for: " + resultado1);

        // usando funçao calcularFatorial2

        long resultado2 = calculoFatorial2(numero);
        System.out.println("Fatorial recursivo: " + resultado2);

        scanner.close();
    }

    // Funções

    // Função com for

    public static long calcularFatorial(long numero) {
        long fat = 1;

        for (long i = 2; i <= numero; i++) fat *= i;
        return fat;
    }


    // Função recursiva
    public static long calculoFatorial2(long numero) {

        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFatorial(numero -1);
        }

    }

}
