public class FuncoesB {

    // Escopo Global
    static int globalVar = 20;

    public static void main(String[] args) {
        
        // 5 - Funções com condicionais
        String r1 = verificarAcesso(19, true, true);

        System.out.println(r1);

        String r2 = verificarAcesso(25, false, true);

        System.out.println(r2);

        // 6 - Funções com switch
        System.out.println(obterDiaDaSemana(5));

        System.out.println(obterDiaDaSemana(10));

        // 7 - System Exit

        verificarAutenticacao("admin", "SenhaSegura");

        System.out.println("Oi!");

        // 8 - Documentação Função
        System.out.println(calcularMedia(5, 6, 7));

        // 9 - escopos

        // escopo local
        int localVar = 10;

        if (true) {
            System.out.println(localVar );
        }

        System.out.println(globalVar);

       int testeFnEscopo = escopoLocal(localVar);

       System.out.println(testeFnEscopo);

       // { } => geralmente delimitam um escopo, cria um escopo

    }
    
    public static String verificarAcesso(
        int idade, 
        boolean temCarteira, 
        boolean temHistoricoNegativo) {

            if (idade >= 18 && temCarteira && !temHistoricoNegativo ) {
                return "Acesso permitido: todos os criteiros atendidos!";
            } else if (idade >= 18 && temCarteira && temHistoricoNegativo) {
                return "Acesso negado: Histórico negativo detectado!";
            }else {
                return "Acesso negado: Critérios não atendidos!";
            }
    }

    public static String obterDiaDaSemana(int dia) {
        
        switch(dia) {
            case 1:
                return "Segunda-feira";
            case 2:
                return "Terça-Feira";
            case 3:
                return "Quarta-Feira";
            case 4:
                return "Quinta-Feira";
            case 5:
                return "Sexta-Feira";
            case 6:
                return "Sabádo";
            case 7:
                return "Domingo";
            default:
                return "Dia inválido";
        }
    }

    public static void verificarAutenticacao(String usuario, String senha) {
        
        if (!usuario.equals("admin") && !senha.equals("SenhaSegura")) {
            System.out.println("Autenticação falhou!");
            System.exit(1);
        }

        System.out.println("Autenticação bem sucedida!");
    }

    /**
     * 
     * Calcula a média de três números inteiros
     * 
     * @param num1 O primeiro número/nota a ser enviado
     * @param num2 O segundo número/nota a ser enviado
     * @param num3 O terceiro número/nota a ser enviado
     * @return A média dos três números
     * 
     */
    public static double calcularMedia(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static int escopoLocal(int a) {
        System.out.println(globalVar);
        System.out.println(a);

        int testeFuncao = 1;

        return testeFuncao;
    }
}
