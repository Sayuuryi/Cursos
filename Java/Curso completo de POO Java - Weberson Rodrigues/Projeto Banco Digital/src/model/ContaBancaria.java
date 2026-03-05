package src.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria {

    //region Atributos
    protected String agencia;

    protected String conta;

    protected Integer digito;

    protected Double saldo;

    protected Date dataAbertura;

    protected ArrayList<Movimentacao> movimentacoes;

    protected Double VALOR_MINIMO_DEPOSITO = 10.0;

    //endregion

    //region Construtores
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();

        // Se não instanciar vai dar uma exception de NullPointerException
        this.movimentacoes = new ArrayList<Movimentacao>();

        // Criando a primeira movimentação.
        Movimentacao movimentacao = new Movimentacao("Abertura de conta", saldoInicial);

        // Aqui estou salvando a movimentação dentro do meu array de movimentações.
        // Aqui estou iniciando o meu extrato bancario.
        this.movimentacoes.add(movimentacao);

    }
    //endregion

    //region Getters e Setters
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

    public Date getDataAbertura() {
        return dataAbertura;
    }

    //endregion

    //region Metodos

    public void depositar(Double valor){

    // Verifica se o valor de deposito é menor que o valor minimo
    // Se for não pode haver deposito.
        if(valor <VALOR_MINIMO_DEPOSITO){
            throw new InputMismatchException("O valor minimo para deposito é de R$" + VALOR_MINIMO_DEPOSITO);
        }

        // Efetua o deposito somando o valor ao saldo.
        this.saldo += valor;

        // Aqui faço uma movimentação no extrato.
        Movimentacao movimentacao = new Movimentacao("Deposito", valor);
        this.movimentacoes.add(movimentacao);
    }

    public Double sacar(Double valor){

        // Verifica se o valor é maior que o saldo da conta.
        // Se for manda mensagem de saldo insuficiente.
        if(valor > this.saldo){
            throw new InputMismatchException("Não foi possível fazer o deposito. Pois o saldo é insuficiente.");
        }

        // Aqui removemos o valor de saque do saldo atual.
        this.saldo -= valor;

        // Aqui faço uma movimentação no extrato.
        Movimentacao movimentacao = new Movimentacao("Retirada de valor", valor);
        this.movimentacoes.add(movimentacao);

        // Retorna o valor sacado ao usuário.
        return valor;
    }

    public void transferir(Double valor, ContaBancaria contaDestino){

        // Efetua um saque na conta atual
        this.sacar(valor);

        // Efetua o deposito na conta de destino.
        contaDestino.depositar(valor);
    }
    //endregion


    // Metodo abstrato obriga as classes que estão herdando de implementarem esse metodo.
    public abstract void imprimirExtrato();

}
