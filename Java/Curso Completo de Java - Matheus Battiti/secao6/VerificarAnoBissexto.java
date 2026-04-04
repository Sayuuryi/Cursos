public class VerificarAnoBissexto {

    public static void main (String[] args) {
        
        verificarAnoBissexto(2020);

    }
    
    
    public static String verificarAnoBissexto(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            return "Ano Bissexto";
        } else {
            return "Ano Não Bissexto";
        }
            
    }
}