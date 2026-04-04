
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da tabuada: ");

        int numerodigitado = scanner.nextInt();

        System.out.println(numerodigitado + " x 1 = " + numerodigitado * 1);
        System.out.println(numerodigitado + " x 2 = " + numerodigitado * 2);
        System.out.println(numerodigitado + " x 3 = " + numerodigitado * 3);
        System.out.println(numerodigitado + " x 4 = " + numerodigitado * 4);
        System.out.println(numerodigitado + " x 5 = " + numerodigitado * 5);
        System.out.println(numerodigitado + " x 6 = " + numerodigitado * 6);
        System.out.println(numerodigitado + " x 7 = " + numerodigitado * 7);
        System.out.println(numerodigitado + " x 8 = " + numerodigitado * 8);
        System.out.println(numerodigitado + " x 9 = " + numerodigitado * 9);
        System.out.println(numerodigitado + " x 10 = " + numerodigitado * 10);

//        Versão feita com while
//        int numero = 1;
//        while(numero <= 10) {
//            System.out.println(numerodigitado + " x " + numero + " = " + numerodigitado * numero );
//            numero ++;
//        }

        scanner.close();

    }

}