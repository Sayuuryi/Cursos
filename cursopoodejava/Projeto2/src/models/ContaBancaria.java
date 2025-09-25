package models;

import java.util.InputMismatchException;

public class ContaBancaria {

    //#region Atributos
    private String agencia;

    private String conta;

    private Integer digito;

    private Double saldo;

    private Double VALOR_MINIMO_DEPOSITO = 10.0;

    //#endregion
    
    //#region Construtores
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
    }
    //#endregion

    //#region Getters e Setters
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }
    //#endregion
    
    //#region Metodos

    public void depositar(Double valor){

        // Verifica se o valor de deposito é menor que o valor mínimo.
        // Se for não pode acontecer depósito.
        if(valor < VALOR_MINIMO_DEPOSITO){
            throw new InputMismatchException("O valor minimo de deposiot é R$" + VALOR_MINIMO_DEPOSITO);
        }

        // Efetua o depósito somando o valor ao saldo.
        // this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    public Double sacar(Double valor){

        // Verifica se o valor de saque é maior que o valor de saldo da
        // Se for mostra mensagem que o saldo é insuficiente.
        if(valor > this.saldo){
            throw new InputMismatchException("O Saldo é insuficiente");
        }

        // Remoção do valor de saque do saldo
        // this.saldo = this.saldo - valor;
        this.saldo -= valor;
        
        // Retorna o valor sacado ao usuário.
        return valor;
    }

    public void transferir(Double valor, ContaBancaria contaDestino){

        // Efetua um saque na conta atual
        this.sacar(valor);

        // Efetua o depósito na conta de destino.
        contaDestino.depositar((valor));

    }

    //#endregion

}
