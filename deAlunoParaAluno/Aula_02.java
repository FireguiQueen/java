// ESTRUTURA DO PROGRAMA
/*
    Neste ponto inicial da linguagem Java, vamos ignorar algumas palavras-chave, tais como:
    public, static, void, String[]...
*/

// Os colchetes representam um bloco, um escopo.
/*
    ! Não se preocupe caso não entenda a explicação, ao longo do tempo, você fácilmente
    entenderá o que é um escopo.

    O escopo determina quais itens (geralmente variáveis) do nosso programa estarão
    disponíveis ou não em outras partes dele.
    O escopo quem define o grau de ocultação de uma informação, isto é,
    a visibilidade e acessibilidade às variáveis em diferentes partes do programa.

    Podemos fazer uma analogia com uma cidade.
    Uma cidade possui diversos serviços públicos, como por exemplo, a limpeza e a coleta
    de lixo.
    Dentro desta cidade há diversos bairros. E esses bairros
    possuem seus próprios serviços, que, qualquer morador deste bairro, pode utilizar.

    A cidade é o nosso escopo principal. O bairro é um escopo que está dentro
    do nosso escopo principal. A cidade não pode utilizar os serviços do bairro, mas o bairro pode utilizar os
    serviços da cidade.

    Isto é, o escopo pai (cidade) não pode utilizar os serviços do escopo filho (bairro).
    O escopo filho (bairro) pode utilizar os serviços do escopo pai (cidade).
 */

// A nossa classe 'Aula_02' possui seu próprio escopo.
// Tudo o que está dentro deste escopo pertence à nossa classe.
class Aula_02
{

    // Este é o nosso método principal e ele indica o PONTO DE PARTIDA do nosso programa;
    // Este método quem derá inicio a execução de todas as instruções de nosso programa.
    //>> class_aula 02 tem seu escopo, e dentro deste escopo, foi criado outro escopo (o método main)
    public static void main(String[] args)
    {
        // ESTE É O ESCOPO DO MÉTODO PRINCIPAL, AQUI SERÁ PASSADO AS INSTRUÇÕES DO NOSSO PROGRAMA.

        // O "println" é responsável por imprimir uma mensagem em nosso terminal.
        // Dentro dos parênteses, passamos uma string que deve estar contida entre aspas duplas.
        System.out.println("Olá!");

    }
}