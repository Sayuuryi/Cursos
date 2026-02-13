package src.model;

import src.utils.DataUtil;

import java.util.Date;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String agencia, String conta, Integer digito, Double saldoInicial) {
        super(agencia, conta, digito, saldoInicial);

    }

    @Override
    public void imprimirExtrato() {

        System.out.println("********************************");
        System.out.println("******* Extrato Poupança *******");
        System.out.println("********************************");
        System.out.println();

        System.out.println("Gerado em: " + DataUtil.converterDateParaDataEHora(new Date()));
        System.out.println();

        for (Movimentacao movimentacao: this.movimentacoes) {
            System.out.println(movimentacao);
            System.out.println();
        }

        System.out.println("********************************");
        System.out.println("********************************");
        System.out.println("********************************");
    }
}
