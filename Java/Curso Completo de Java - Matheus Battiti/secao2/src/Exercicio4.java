public class Exercicio4 {

    public static void main(String[] args) {

       long numeroLong = 2_000_000_000;
       int numeroConvertido = (int) numeroLong;

        System.out.println("O Numero era antes da conversão explicita era: " + numeroLong);
        System.out.println("O Numero após a conversão ficou como: " + numeroConvertido);
    }
}
