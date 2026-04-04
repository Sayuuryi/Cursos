import java.util.Scanner;

public class calculadoraSimples {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double[] numerosCalcular = pedirNumeros(scanner);
        int opcao = menuUsuario(scanner);
        double resultado = 0;

        switch (opcao) {
            case 1:
                System.out.println();
                System.out.println("Você selecionou a opçao de Soma!");
                System.out.println();
                resultado = soma(numerosCalcular[0], numerosCalcular[1]);
                break;
            case 2:
                System.out.println();
                System.out.println("Você selecionou a opçao de Subtracao!");
                System.out.println();
                resultado = subtracao(numerosCalcular[0], numerosCalcular[1]);
                break;
            case 3:
                System.out.println();
                System.out.println("Você selecionou a opçao de Multiplicacao!");
                System.out.println();
                resultado = multiplicacao(numerosCalcular[0], numerosCalcular[1]);
                break;
            case 4:
                System.out.println();
                System.out.println("Você selecionou a opçao de Divisao!");
                System.out.println();
                resultado = divisao(numerosCalcular[0], numerosCalcular[1]);
                break;
            default:
                System.out.println();
                System.out.println("Por favor selecione apenas opçoes mostradas no menu.");
                System.exit(1);
        }

        System.out.println("O Resultado da sua Operaçao é: " + resultado);

        scanner.close();

    }

    // Funções do programa

    // Menu que é mostrado para o usuário.
    public static int menuUsuario(Scanner scanner) {

        System.out.println("===================== Calculadora Simples =====================");
        System.out.println();
        System.out.println("Por favor selecione abaixo qual será a operaçao a ser feita: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.println("===============================================================");
        System.out.println();
        
        int opcao = scanner.nextInt();
        return opcao;


    }

    // Função que faz a requisição dos numeros para serem calculados
    public static double[] pedirNumeros (Scanner scanner) {

        System.out.println("Digite o primeiro numero a ser calculado: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero a ser calculado: ");
        double n2 = scanner.nextDouble();

        return new double[]{n1, n2};

    }

    // Função de Soma
    public static double soma(double n1, double n2) {
        
        double soma = n1 + n2;
        return soma;

    }

    // Função de Subtração
    public static double subtracao(double n1, double n2) {

        double subtracao = n1 - n2;
        return subtracao;

    }

    // Função de Multiplicação
    public static double multiplicacao(double n1, double n2) {

        double multiplicacao = n1 * n2;
        return multiplicacao;
    
    }

    // Função de Divisão
    public static double divisao(double n1, double n2) {

        if (n2 == 0) {
            System.out.println("Divisao por zero nao é aceita. ");
            System.exit(1);
            return 0;
        } else {
            return n1 / n2;
        }
    
    }

}