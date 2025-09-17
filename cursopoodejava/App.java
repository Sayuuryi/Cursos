public class App {
    public static void main(String[] args) {

        System.out.println("Aprendendo POO com Java");

        // Que estou instanciando uma classe, construindo um objeto
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Fulano";
        pessoa1.idade = 22;

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Ciclano";
        pessoa2.idade = 23;

        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.idade);

        Carro meuCarro = new Carro();
        meuCarro.ano = 2022;
        meuCarro.modelo = "Hyundai";
        meuCarro.cor = "Preto";
    }
}