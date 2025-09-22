package sayu.main;

import sayu.models.ContaBancaria;

public class App {
    
    public static void main(String[] args) {
        System.out.println("Criando meu primeiro Banco Digital.");
        System.out.println();

        
        ContaBancaria conta = new ContaBancaria("0001", "2512", 1, 50.0);

        System.out.println("Saldo Atual de R$" + conta.getSaldo());
        System.out.println();

        conta.depositar(250.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        var saque = conta.sacar(150.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

    }
}