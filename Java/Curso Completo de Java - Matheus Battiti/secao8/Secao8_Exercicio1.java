
import java.util.Scanner;


public class Secao8_Exercicio1 {
    
    public static void main(String[] args) {

        // Como eu fiz na minha primeira tentativa.

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Digite a temperatura em celsius: ");
        // int temperaturaCelsius = scanner.nextInt();
        // double calculoFahrenheit = (temperaturaCelsius * 1.8) + 32;

        // System.out.printf("%d Celsius convertidos para Fahrenheit é igual a: %.0f Fahrenheit\n" ,temperaturaCelsius, calculoFahrenheit);

        // Outro jeito melhor de ter feito o exercicio usando Funções.

        // Exercicio com Funções 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextInt();

        double fahrenheit = converterTemperatura(celsius);

        System.out.println("A temperatura " + celsius + "C convertida em Fahrenheit é: " + fahrenheit + "F");

        scanner.close();
    }

    // Funçoes
    
    public static double converterTemperatura(double celsius) {
        return (celsius * 1.8) + 32;
    }

}
