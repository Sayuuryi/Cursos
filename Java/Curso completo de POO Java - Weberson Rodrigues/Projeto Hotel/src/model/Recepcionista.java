package model;

import interfaces.IRecepcionista;

public class Recepcionista extends Pessoa implements IRecepcionista {

    public Recepcionista(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void atenderOTelefone() {
        System.out.println("Sei atender o telefone");
        System.out.println();
    }

    @Override
    public void falarIngles() {
        System.out.println("Sei falar em ingles");
        System.out.println();
    }
}
