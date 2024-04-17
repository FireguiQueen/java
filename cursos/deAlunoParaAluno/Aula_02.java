// ESTRUTURA DO PROGRAMA
/*
    Neste ponto inicial da linguagem Java, vamos ignorar algumas palavras-chave, tais como:
    public, static, void, String[]...
*/

// Os colchetes representam um bloco, um escopo.
/*
    Não se preocupe se não entender completamente esta explicação. Com o tempo, você compreenderá o que é um escopo.

    O escopo determina quais itens (geralmente variáveis) do nosso programa estarão disponíveis ou não em outras partes dele.
    O escopo define o nível de ocultação de informações, ou seja, a visibilidade e acessibilidade das variáveis em diferentes partes do programa.

    Podemos fazer uma analogia com uma cidade. Uma cidade possui diversos serviços públicos, como a limpeza e a coleta de lixo. Dentro desta cidade, há diversos bairros, e esses bairros possuem seus próprios serviços, que qualquer morador deste bairro pode utilizar.

    A cidade é o nosso escopo principal. O bairro é um escopo que está dentro do nosso escopo principal. A cidade não pode utilizar os serviços do bairro, mas o bairro pode utilizar os serviços da cidade.

    Ou seja, o escopo pai (cidade) não pode utilizar os serviços do escopo filho (bairro), mas o escopo filho (bairro) pode utilizar os serviços do escopo pai (cidade).
 */

// A nossa classe 'Aula_02' possui seu próprio escopo.
// Tudo o que está dentro deste escopo pertence à nossa classe.
class Aula_02
{

    // Este é o nosso método principal e ele indica o PONTO DE PARTIDA do nosso programa;
    // Este método dará início à execução de todas as instruções do nosso programa.
    // A classe 'Aula_02' tem seu escopo, e dentro deste escopo, foi criado outro escopo (o método main).
    public static void main(String[] args)
    {
        // ESTE É O ESCOPO DO MÉTODO PRINCIPAL, AQUI SERÃO PASSADAS AS INSTRUÇÕES DO NOSSO PROGRAMA.

        // O "println" é responsável por imprimir uma mensagem em nosso terminal.
        // Dentro dos parênteses, passamos uma string que deve estar contida entre aspas duplas.
        System.out.println("Olá!");

    }
}
