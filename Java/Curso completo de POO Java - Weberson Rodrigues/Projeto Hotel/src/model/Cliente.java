package model;

import interfaces.IFalaringles;
import interfaces.IRecepcionista;

public class Cliente extends Pessoa implements IFalaringles {

    private Integer idade;
    public Cliente(String nome, String telefone, String cpf, Integer idade) {
        super(nome, telefone, cpf);
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public void falarIngles() {

    }
}