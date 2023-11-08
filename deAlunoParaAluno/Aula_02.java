// ESTRUTURA
/*
    Neste ponto inicial da linguagem Java, vamos ignorar algumas palavras-chave, tais como:
    public, static, void, String[]...
*/

// Os colchetes representam um bloco, um escopo. Tudo o que está dentro deles pertence à nossa classe.
class Aula_02
{

    // Este é o nosso método principal e ele indica o PONTO DE PARTIDA do nosso programa;
    // Usamos a palavra-chave "main" justamente para isso, porque PRECISAMOS de um método PRINCIPAL.
    // Este método quem derá inicio a execução de todas as instruções de nosso programa.
    // > Caso não coloquemos um método principal (main) esta será uma classe de molde utilizada para criar objetos.
    // > Mas veremos isto mais pra frente.
    public static void main(String[] args)
    {
        // NESTE ESCOPO, QUE PERTENCE AO MÉTODO PRINCIPAL, SERÁ PASSADA AS INSTRUÇÕES DO NOSSO PROGRAMA.
        
        // O "println" é o método responsável por imprimir uma mensagem em nosso terminal.
        // Dentro dos parênteses, passamos uma string que deve estar contida entre aspas duplas.
        System.out.println("Olá!");

    }
}