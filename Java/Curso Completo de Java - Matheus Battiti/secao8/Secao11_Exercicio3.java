package secao11;

import java.util.Scanner;

public class Secao11_Exercicio3 {
    
    public static void main(String[] args) {
        
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Digite um numero para ser verificado se é primo: ");
        int numero = Scanner.nextInt();
        boolean ehPrimo = true;

        // testar se ele é primo mesmo
        for (int i = 2; i < numero; i++) {

            // dividir esse cara e não ter resto, ele não é primo
            // 1 e por ele mesmo
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo) {
            System.out.println("O Numero " + numero + " É um número primo!");
        } else {
            System.out.println("O numero " + numero  + " NAO é primo!");
        }


    }

}
