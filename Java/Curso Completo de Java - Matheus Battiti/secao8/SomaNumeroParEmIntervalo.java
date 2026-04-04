public class SomaNumeroParEmIntervalo {

    public static void main (String[] args) {

        System.out.println(somarNumerosPares(1, 30));
        System.out.println(somarNumerosPares(5, 15));
        System.out.println(somarNumerosPares(0, 6));
        
    }
    
    // Functions
    
    public static int somarNumerosPares(int n1, int n2) {

        int soma = 0;

        for(int i = n1; i <= n2; i++) {

            if(i % 2 == 0) {
                soma += i;
            }

        }
        
        return soma;

    }

}