

public class Secao8_Exercicio6 {
 
    public static void main(String[] args) {

        int[] listaNumeros = {5, 8, 9, 4, 11, 25, 14};

        System.out.println(encontrarMaiorNumero(listaNumeros));

    }

    // Funções

    public static int encontrarMaiorNumero(int[] listaNumeros ) {

        int maior = listaNumeros[0];

        // Contador, cond. execução, Incremeto
        for (int i = 1; i < listaNumeros.length; i++) {
            if(listaNumeros[i] > maior) {
                maior = listaNumeros[i];
            }
        }

        return maior;
    }
}
