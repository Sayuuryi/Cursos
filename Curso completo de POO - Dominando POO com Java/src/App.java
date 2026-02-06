package src;

import src.model.ContaCorrente;
import src.model.ContaPoupanca;
import src.utils.DataUtil;

public class App {

    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital");
        System.out.println();


        ContaCorrente conta = new ContaCorrente("0001","7542",5,100.0);


        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        conta.depositar(250.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        var saque = conta.sacar(150.);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        ContaPoupanca conta2 = new ContaPoupanca("0002", "7543", 6, 200.0);

        conta2.transferir(100.0, conta);
        System.out.println("Saldo conta destino de R$" + conta2.getSaldo());
        System.out.println();

        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();


        System.out.println(conta2.getDataAbertura());


        // Para chamar uma classe static você simplesmente coloca o nome da Classe.Metodo(e ai aqui dentro vc coloca
        // onde que o metodo vai pegar as informações, por exemplo conta2.getDataAbertura() ele pega a data de Abertura
        // da conta 2.
        var f1 = DataUtil.converterDateParaDataEHora(conta2.getDataAbertura());
        var f2 = DataUtil.converterDateParaData(conta2.getDataAbertura());
        var f3 = DataUtil.converterDateParaHora(conta2.getDataAbertura());
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        // Extrato bancario é composto por movimentações bancárias
        // Ter algo que possa ser a movimentação


    }
}