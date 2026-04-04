package secao11;

public class Secao12_Exercicio6 {


    public static void main(String[] args) {

        int numeroParaContar = 48484848;
        int contador = 0;
        
        while (numeroParaContar > 0) {
            contador++;

            numeroParaContar /= 10;
        }

        System.out.println(contador);

    }
}
