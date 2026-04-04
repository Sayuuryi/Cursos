package secao11;

public class Secao11_Exercicio4 {
    
    public static void main(String[] args) {

        int opcao;

        do {

            System.out.println("0 - Agua");
            System.out.println("1 - Coca cola");
            System.out.println("2 - Guarana");
            System.out.println("3 - Fanta Laranja");
            System.out.println("4 - Sair");
            System.out.println();

            opcao = (int)(Math.random() * 5);
            
            System.out.println("A opçao escolhida foi " + opcao);
            System.out.println();

        } while ( opcao != 4);
        
    }

}
