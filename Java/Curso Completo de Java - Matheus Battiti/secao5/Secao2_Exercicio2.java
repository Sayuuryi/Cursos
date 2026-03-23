package secao5;

import java.util.Scanner;

public class Secao2_Exercicio2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome de usuario: ");
        String usuario = scanner.next();

        System.out.println("Digite uma senha: ");
        String senha = scanner.next();

        // String => equals
        if (usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }

        scanner.close();

    }
}
