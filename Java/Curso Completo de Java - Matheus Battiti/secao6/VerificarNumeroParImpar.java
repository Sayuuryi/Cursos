public class VerificarNumeroParImpar {
    
    public static void main (String[] args) {
    
        verificarParOuImpar(5);
    }
    

    public static String verificarParOuImpar(int numero) {
        if (numero % 2 == 0 ) {
            return "Número Par";
        } else {
            return "Número Ímpar"; 
        }
    }
}