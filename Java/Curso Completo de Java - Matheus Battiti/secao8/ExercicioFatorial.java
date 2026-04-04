public class ExercicioFatorial {

    public static void main (String[] args) {

        int fatorial;
        
        System.out.println("O Fatorial do numero: é: " + calcularFatorial(5));

    }
    
    // Functions
    
    public static int calcularFatorial (int numero) {

        int fatorial = 1;

        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
            
        }
        
        return fatorial;
        
    }
    
}