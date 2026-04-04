public class VerificarIdadeComCondicional {

    public String verificarIdade(int idade) {

        if (idade < 18) {
            return "Menor de idade";
        } else if (idade <= 64) {
            return "Adulto";
        } else {
            return "Idoso";
        }

    }

}