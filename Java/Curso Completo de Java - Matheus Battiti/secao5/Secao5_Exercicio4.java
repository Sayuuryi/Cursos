package secao5;

import java.util.Scanner;

public class Secao5_Exercicio4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero de 1 a 7 (referente ao dia da semana): ");
        int diaDaSemana = scanner.nextInt();

        // Começa no Domingo
        switch (diaDaSemana) {
            case 1:
            case 7:
                System.out.println("Final de semana");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia da semana");
                break;
            default:
                System.out.println("Numero inválido!");
                break;
        }

    }    

}
