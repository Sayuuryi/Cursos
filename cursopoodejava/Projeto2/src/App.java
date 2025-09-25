import models.ContaCorrente;
import models.ContaPoupanca;

public class App {
    
    public static void main(String[] args) {
        System.out.println("Criando meu primeiro Banco Digital.");
        System.out.println();

        
        ContaCorrente conta = new ContaCorrente("0001", "2512", 1, 50.0);

        System.out.println("Saldo Atual de R$" + conta.getSaldo());
        System.out.println();

        conta.depositar(250.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        var saque = conta.sacar(150.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        ContaPoupanca conta2 = new ContaPoupanca("0001", "2512", 1, 200.0);

        conta2.transferir(100.0, conta);
        System.out.println("Saldo conta destino de R$" + conta2.getSaldo());
        System.out.println();

        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

    }
}

