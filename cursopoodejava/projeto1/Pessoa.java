public class Pessoa {
    // Atributos
    private String nome;
    private Integer idade;
    // private String nomeCompleto;

    // Getters e Setters
    public void setNome(String nome){
        // Aqui pode ter validações e outras coisas.
        this.nome = nome;
    }

    public String getNome(){
         return this.nome;
    }

    public Integer getIdade(){
        return this.idade;
    }

        public void setIdade(Integer idade){
        this.idade = idade;
    }

}

/**
 * METODOS ACESSORES:
 * 
 * PUBLIC: Indica que qualquer um pode acessar o elemento.
 * PRIVATE: Indica que somente a classe cosnegue aecssar.
 * PROTECTED: Indica que somente a classe e seus filhos conseguem acessar 
 * DEFAULT: Indica que somente a classe, seus filhos e as classes no mesmo package, podem acessar
 */

/*
 * Getters e Setters
 */