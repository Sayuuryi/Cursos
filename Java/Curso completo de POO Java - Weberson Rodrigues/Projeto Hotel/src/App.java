import model.*;

import java.util.ArrayList;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        System.out.println("Hotel Java");
        System.out.println();



        Recepcionista recepcionista1 = new Recepcionista("Valéria", "64999536323", "15221630633");

        recepcionista1.atenderOTelefone();
        recepcionista1.falarIngles();

        Camareira camareira1 = new Camareira("Joana", "61999211234", "93202212452");

        camareira1.arrumarACama();
        camareira1.limparQuarto();


        // Deu uma dor de barriga na Valéria
        Gerente gerente1 = new Gerente("Fabricio", "64999236664", "95231222145");

        gerente1.atenderOTelefone();
        gerente1.falarIngles();
        gerente1.arrumarACama();
        gerente1.limparQuarto();

        Quarto quarto1 = new Quarto();
        quarto1.setNumero("206A");
        quarto1.setValor(100.0);
        quarto1.setTipo(EnumTipo.BASICO);

        Quarto quarto2 = new Quarto();
        quarto2.setNumero("306A");
        quarto2.setValor(200.0);
        quarto2.setTipo(EnumTipo.PRESIDENCIAL);

        System.out.println(quarto2.getTipo());
        System.out.println(quarto2.getTipo().getValor());

        Cliente cliente1 = new Cliente("Manoel da Silva", "63996641296", "96482353253", 42);
        Cliente cliente2 = new Cliente("Fulano de Tal", "63929641296", "96482353253", 21);
        Cliente cliente3 = new Cliente("Ciclano Rodrigues", "63995641296", "96432383253", 36);
        Cliente cliente4 = new Cliente("Beltrano Rodrigues", "63999641496", "96432353273", 56);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(cliente1); // 0
        clientes.add(cliente2); // 1
        clientes.add(cliente3); // 2
        clientes.add(cliente4); // 3

        // Retorna a quantidade de elementos presentes em uma stream ( stream é uma coleção )
        clientes.stream().count();
        clientes.size();

        clientes.stream()
                .limit(2)
                .forEach(c -> System.out.println(c.getNome()));

        clientes.stream()
                .skip(2)
                .forEach(c -> System.out.println(c.getNome()));

//      var resultado3 = clientes.stream().sorted();

//      clientes.stream().sorted(comparing(Cliente::getIdade));

        clientes.stream()
              .filter(c -> c.getIdade() > 25)
              .forEach(c -> System.out.println(c.getNome()));


        System.out.println();
        System.out.println();


        clientes.stream()
                .filter(c -> c.getNome().contains("Rodrigues"))
                .forEach(c -> System.out.println(c.getNome()));

        clientes.stream()
                .filter(c -> c.getNome().startsWith("B"))
                .forEach(c -> System.out.println(c.getNome()));


        clientes.stream().map(c -> c.getNome());

        clientes.stream().map(Cliente::getNome);


        Agendamento agendamento1 = new Agendamento(camareira1);
        Agendamento agendamento2 = new Agendamento(gerente1);


    }
}