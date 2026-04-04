import java.util.Scanner;

public class Secao8_Exercicio4 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua nota: ");
        int nota = scanner.nextInt();

        System.out.println("A nota digitada foi " + nota);
        System.out.println();

        System.out.println("--------------------------");
        System.out.println("Classificacao de notas: ");
        System.out.println(classificarNotas(nota));

    }

    // Funções 

     public static String classificarNotas(int nota) {

    // Validação para garantir que a nota está dentro do intervalo permitido.
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve ser entre 0 a 10. ");

        }

        switch (nota / 10) {
            case 10:
            case 9:
                return "Sua nota foi classificada em A";
            case 8:
                return "Sua nota foi classificada em B";
            case 7:
                return "Sua nota foi classificada em C";
            case 6:
                return "Sua nota foi classificada em D";
            default:
                return "Sua nota foi classificada em F";
        }
    }
}
