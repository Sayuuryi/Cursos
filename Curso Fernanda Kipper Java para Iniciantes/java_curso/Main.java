package java_curso;

// public -> acessivel de todo lugar
// default -> quando eu nao defino, ele segue esse daqui
// private -> acessivel somente dentro da classe que foi definido
// protected -> acessivel por todo mundo que está no mesmo pacote

public class Main {

    public static void test() {
        System.out.println("Teste");
    }

    public static void main(String[] args) {
        Carro meuCarro = new Sandero();
        Carro meuCarro2 = new Mobi();

        SerVivo meuSer = new Humano();
        meuSer.respirar();

        Carro meuErroFurado = null;


        try {
            meuErroFurado.acelerar();
        } catch (NullPointerException exception){
            System.out.println("vende carro furado");
        }
    }
}