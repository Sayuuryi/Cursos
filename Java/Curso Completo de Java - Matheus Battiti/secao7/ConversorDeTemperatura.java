package secao7;

import java.util.Scanner;

public class ConversorDeTemperatura {
    
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
            System.out.println("Você escolheu converter Celsius para Fahrenheit");
            System.out.println();

            System.out.println("Digite a temperatura a ser convertida: ");
            int temperatura = scanner.nextInt();

            System.out.println(converterCParaFahrenheit(temperatura));
        } else if (escolha == 2) {
            System.out.println("Você escolheu converteu Fahrenheit para Celsius."); 
            System.out.println();

            System.out.println("Digite a temperatura a ser convertida: ");
            int temperatura = scanner.nextInt();

            System.out.println(converterFParaCelsius(temperatura));
        } else {
            System.out.println("Por favor escolha apenas 1 ou 2.");
            System.exit(1);
        }

        scanner.close();
    }

    public static String converterCParaFahrenheit (double temperatura) {
        double fahrenheit = (temperatura * 1.8) + 32;
        return "A temperatura de " + temperatura + " Celsius convertida para Fahrenheit é de: " + fahrenheit;
    }

        public static String converterFParaCelsius (double temperatura) {
        double celsius = (temperatura - 32) % 1.8;
        return "A temperatura de " + temperatura + " Fahrenheit convertida para Celsius é de: " + celsius;
    }

}