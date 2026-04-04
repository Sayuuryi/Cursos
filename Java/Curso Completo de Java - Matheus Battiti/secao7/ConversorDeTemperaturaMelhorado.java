package secao7;

import java.util.Scanner;

public class ConversorDeTemperaturaMelhorado {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Menu perguntando o que o usuário quer converter. 
        System.out.println("==========================================");
        System.out.println("Conversor de Temperatura ");
        System.out.println();
        System.out.println("Escolha uma das opçoes: ");
        System.out.println("1 - Converter Celsius para Fahrenheit");
        System.out.println("2 - Converter Fahrenheit para Celsius");
        System.out.println("==========================================");
        
        int escolha = scanner.nextInt();

        System.out.println();

        if (escolha == 1) {

            converterCParaFahrenheit();

            System.out.println("Você escolheu converter Celsius para Fahrentheit.");
            System.out.println();

        } else if (escolha == 2) {

            converterFParaCelsius();

            System.out.println("Você escolheu converter Fahrenheit em Celsius."); 
            System.out.println();


        } else {
            System.out.println("Opção inválida.");
            System.exit(1);
        }

        scanner.close();
    }

    public static void converterCParaFahrenheit () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celsius: ");

        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("A temperatura de " + celsius + " Celsius convertida para Fahrenheit é de: " + fahrenheit);

        scanner.close();
    }

    public static void converterFParaCelsius () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fahrenheit: ");

        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println("A temperatura de " + fahrenheit + " Fahrenheit convertida para Celsius é de: " + celsius);

        scanner.close();
    }

}