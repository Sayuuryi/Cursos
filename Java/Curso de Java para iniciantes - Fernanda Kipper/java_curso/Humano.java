package java_curso;

public class Humano extends SerVivo {
    public String nome;
    public Humano(){
        super(23);
        this.nome = "Sayu";
    }

    @Override
    public void respirar() {
        System.out.println("transformando em oxigenio");
    }
}
