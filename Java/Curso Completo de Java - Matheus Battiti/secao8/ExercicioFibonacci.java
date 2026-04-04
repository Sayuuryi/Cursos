
import java.util.Arrays;

public class ExercicioFibonacci {

    public static void main(String[] args) {
        int n = 6;

        System.out.println("A sequência de Fibonacci para n=" + n +" deve ser" + Arrays.toString(gerarFibonacci(n)));

    }

    public static int[] gerarFibonacci (int numero) {

        int[] fib = new int[numero];

        if (numero > 0) {
            fib[0] = 0;
        }

        if (numero > 1) {
            fib[1] = 1;
        }

        for (int i = 2; i < numero; i++) {
            fib[i] = fib[i - 1] + fib [i - 2];
        }

        
        return fib;
    }

}