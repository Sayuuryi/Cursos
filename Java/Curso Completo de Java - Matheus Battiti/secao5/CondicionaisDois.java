package secao5;

public class CondicionaisDois {
 
    public static void main(String[] args) {

        // 1 - Condicional ternária
        int numero = 11;
        String resultado = (numero % 2 == 0) ? "Par" : "Impar";

        System.out.println(resultado);

        // CONDICAO x > 5 ? EXPRESSAO SE É TRUE "OK" : EXPRESSAO SE É FALSO "Nao OK"

        // 2 - If encadeado
        int idade = 25;
        boolean temCarteira = true;

        if(idade >= 18) {

            if(temCarteira) {
                System.out.println("Pode dirigir!");
            } else {
                System.out.println("Precisa ter a habilitação para dirigir!");
            }

        } else {
            System.out.println("Você não pode dirigir ainda!");
        }

        // 3 - Precedência
        boolean a = true;
        boolean b = false;
        boolean c = true;
        
        // TRUE AND FALSE -> FALSE OR TRUE -> TRUE
        boolean resultado2 = a && b || c;

        System.out.println(resultado2);

        // TRUE OR FALSE -> TRUE AND TRUE -> TRUE
        boolean resultado3 = a || b && c;

        System.out.println(resultado3);

        boolean resultado4 = (!a || b) && c;
        // NOT (TRUE OU FALSE) => NOT(TRUE) => FALSE AND TRUE => FALSE
        System.out.println(resultado4);

        boolean resultado5 = (!a || b) && c;
        // (NOT TRUE OR FALSE) AND TRUE
        // (FALSE OR FALSE) AND TRUE
        // FALSE AND TRUE
        // FALSE
        System.out.println(resultado5);
    }
}