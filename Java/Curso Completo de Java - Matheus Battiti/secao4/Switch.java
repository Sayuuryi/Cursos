package secao4;

public class Switch {

    public static void main(String[] args) {

        // 11 - switch case e break

        // para validar dia de semana baseado no número
        // 1 = Domingo
        // 7 = Sabado
        int diaDaSemana = 1;

        switch (diaDaSemana) {

            case 1: 
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terca-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
        }

        // if(diaDaSemana == 1 ) {} else if (diaDaSemana == 2) {} ...

        // 12 - default

        // default é o else do switch 

        int n = 10;

        switch (n) {
            case 1:
                System.out.println("vale 1");
                break;
            case 2:
                System.out.println("vale 2");       
                break;
            default:
                System.out.println("Numero nao encontrado");
                break;
        }

        // 13 - switch sem break

        switch (1) {
            case 1:
                System.out.println("Executou 1");

            case 2:
                System.out.println("Executou 2");

            case 3:
                System.out.println("Executou 3");

            default:
                System.out.println("Executou 4");
        }
    }
}
