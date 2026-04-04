package secao4;

import java.util.Scanner;

public class Secao5_Exercicio3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero: ");

        // verificando se é par ou impar
        int numero = scanner.nextInt();
        String resultado = "";

        if (numero % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Impar";
        }

        System.out.println("O Numero digitado é: " + resultado);
    }    

}
