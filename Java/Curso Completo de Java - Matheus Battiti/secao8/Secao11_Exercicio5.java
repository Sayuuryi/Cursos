package secao11;
public class Secao11_Exercicio5 {
    


    public static void main(String[] args) {
        
        int numero = 5;
        int fatorial = 1;

        // Calculando numero fatorial com for
        for (int i = 1; i <= numero ; i++) {
            fatorial *= i;

        }

        System.out.println("O fatorial de " + numero + " é igual a " + fatorial);

    } 
}
