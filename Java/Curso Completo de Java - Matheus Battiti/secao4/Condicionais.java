package secao4;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {

//      1 - o que é boolean?
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);

        // 2 - Operadores de comparação

        int x = 10;

        System.out.println(x == 10);

        System.out.println(x == 9);

        System.out.println(x != 5);

        System.out.println(x != 10);

        System.out.println(x > 10);

        // x é maior ou igual a 10
        System.out.println(x >= 10);

        // x é menor que 10
        System.out.println(x < 10);

        // x é menor ou igual a 10
        System.out.println(x <= 10);

        // 3 - atribuição e comparação
        int n = 5;
        int m = 10;

        System.out.println( n == 12);

        System.out.println(n);

        System.out.println(n == m);

        // 4 - Comparação de strings

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);

        System.out.println(str1 == "Java");

        System.out.println(str1.equals(str2));

        System.out.println(str2.equals(str1));

        System.out.println(str1.equals("Java"));

        // Java == JAVA ( false ) > java == java
        System.out.println(str1.equalsIgnoreCase(str2));

        // 5 - if
        int numero = 10;

        // Baseado em uma comparação, eu executo algo
        if (numero > 5) {

            System.out.println("O numero é maior que 5");
        }

        // if com strings
        String texto = "Teste";

        // Se a função retorna um booleano, eu posso usar no if.

        if(texto.equals("Teste")) {

            System.out.println("O texto é: Teste");

        }

        // declaração do if (comparação ou retorno de booleano) {o que será executado... }


        // 6 - else
        int q = 71;

        if (q > 10) {
            System.out.println("Q é maior q 10");
        } else {

            System.out.println("Insira um número maior que 10");

        }

        // Tod o else precisa de um if, mais nem tod o if precisa ter um else

        if(texto.equals("Teste")) {

            System.out.println("O texto é Teste");

        } else {

            System.out.println("O texto não é igual!");

        }


        // 7 - else if
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a sua nota: ");
        int nota = leitor.nextInt();

        // double nota = 8.5;

        // && significa AND ou E
        // || significa OR ou OU
        // o simbolo ! significa NOT ou NAO
        if (nota >= 9 && nota <= 10) {
            System.out.println("Sua nota está muito boa!");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("Sua nota está acima da média!");
        } else if (nota < 7 && nota > 0 ) {
            System.out.println("Sua nota está abaixo da média!");
        } else if (nota < 1 || nota >= 11) {
            System.out.println("O valor inserido é inválido.");
            System.out.println("Por favor insira um valor de 1 até 10.");
        }

        int num = 5;
        if (num > 3) {
            System.out.println("Alguma coisa");
        } else if (num == 5) {
            System.out.println("Outra coisa aqui!");
        }

        // 1 - vou escolher qual a situação que eu quero q mais ocorra
        // 2 - melhorar a lógica, deixo a comparação mais específica
    }

}





