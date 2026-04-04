package secao4;

import java.util.Scanner;

public class Secao5_Exercicio5 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero de 10 a 20: ");
        int numero = scanner.nextInt();

        if (numero >= 10 && numero <= 20) {
            System.out.println("Dentro do intervalo");
        } else {
            System.out.println("Fora do intervalo");
        }
    
    }
}
