// ESTRUTURA CONDICIONAL: ELSE IF / ELSE
/*
    A palavra-chave 'if' define a primeira condição para a nossa estrutura condicional.
    Mas e se a expressão do bloco 'if' for avaliada como 'false'?
    Iríamos precisar de uma consequência.

    Por exemplo:
    1. SE eu tenho dinheiro: eu posso comprar o PS4.
    2. SENÃO: eu não posso.

    Observe que no exemplo acima, no índice '1', temos uma condição.
    Mas o índice '2' NÃO pode ser considerado uma condição; ele só ocorre quando a condição
    anterior for falsa. Isto é, se eu não tenho dinheiro, logo eu não posso.
    Podemos dizer que o 'índice 2' é uma CONSEQUÊNCIA da condição anterior não acontecer.
*/

package introducao.EstruturasCondicionais;

public class Aula_010___estruturaCondicional_II
{
    public static void main(String[] args) {
        /* * ELSE  * */

        // EXEMPLO
        /*
            Você é o dono de um bar e você vende bebebidas apenas para maiores de 18.
            Em código, ficaria assim:
        */

        int pessoaIdade = 16; // Suponhamos que a idade da pessoa seja 20 para o exemplo.
        if (pessoaIdade >= 18) {
            System.out.println("Vocẽ pode comprar cerveja.");
        } else {
            System.out.println("Você não pode comprar cerveja.");
        }
        // Se a pessoa não é maior que 18, a única resposta possível será que ela não pode.
        // O "else" só ocorre caso a(s) condição(ões) anterior(es) a ele não ocorra.

        // Nosso 'if' foi executado, e nossa expressão foi avaliada.
        // Como a expressão pergunta "pessoaIdade >= 18", ela retornará false, pois a idade não é MAIOR ou IGUAL a 18.
        // Então, o nosso "if" não foi executado. Como consequência, o nosso 'else' será executado.

        // Resumidamente, o 'else' é utilizado como uma alternativa quando todas as condições anteriores são falsas.
        // Ele não avalia condições; o objetivo dele é ser executado quando nenhuma das condições anteriores é satisfeita.


        // ****** ** ****** ** ****** ******** ******** ** ****** ** ****** ** ****** **


        // ELSE IF
        /*
            O 'else if' é utilizado para adicionar mais de uma condição em nossa estrutura condicional.
            O 'else if' só é avaliado SE a condição anterior for falsa.
        */

        // EXEMPLO
        /*
            Abaixo temos um sistema simples que determina a faixa etária com as seguintes categorias:
            - Bebê, Criança, Adolescente, Adulto
        */
        int age = 18; // Não digite números negativos.

        if (age <= 3) {
            System.out.println("Você é um bebê");
        } else if (age >= 4 && age <= 12) {
            System.out.println("Você é uma criança");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Você é um adolescente");
        } else {
            System.out.println("Você é um adulto");
        }

        // Primeiro, a expressão do 'if' é avaliada.
        // "age <= 3" - esta expressão retorna "false" pois a idade não é menor ou igual a 3. -> O bloco 'if' não é executado.
        // "age >= 4 && age <= 12" - esta expressão retorna "false". -> O bloco 'else if' não é executado.
        // "age >= 13 && age <= 19" - isto é: a idade é maior ou igual a 13 E (&&) a idade é menor ou igual a 19? Esta expressão retorna true. O bloco é executado.
        // E CASO o 'else if' acima não fosse executado, nosso 'else' seria acionado.

        // Por que devemos utilizar 'else if' se tudo poderia ser resolvido com 'IFs'?
        /*
            Darei o mesmo exemplo, mas desta vez, usando apenas "IF" para a construção do código.

            ** PROBLEMAS
            - Quando colocados, eles são entendidos como diferentes estruturas.
            Isto é, mesmo que a condição anterior seja verdadeira, o IF será analisado.
            E isso pode causar problemas de eficiência e até mesmo bugs.
        */

        int idade = 13;

        if (idade <= 3) { // Esta expressão será considerada TRUE; O bloco é executado.
            System.out.println("Você é uma criança");
        } if (idade >= 4 && idade <= 12) { // Como temos outro "IF", ele será avaliado também, pois é considerado outra nova estrutura.
            System.out.println("Você é uma criança");
        } if (idade >= 13 && idade <= 19) { // Como temos outro "IF", ele será avaliado também, pois é considerado outra nova estrutura.
            System.out.println("Você é um adolescente");
        } else { // Caso o 'if' acima seja falso, este 'else' será executado.
            System.out.println("Você é um adulto");
        }

        // CONCLUSÃO:
        // A primeira condição da nossa estrutura foi considerada verdadeira e o bloco foi executado, gerando a mensagem:
        // "Você é uma criança" no nosso terminal.
        // O problema é que logo abaixo temos outro "IF", e ele será analisado mesmo que a condição anterior a ele seja verdadeira.
        // O correto seria usar o "ELSE IF", e ele não seria avaliado pois a condição anterior a ele foi considerada "verdadeira".

        // O bug pode surgir quando temos o else em uma estrutura onde há somente "IFs". Isso ocorre porque, como eu já disse,
        // o "IF" sempre será avaliado, enquanto o "else if" só será avaliado quando a condição anterior a ele for considerada "false".
        // Então, a primeira condição do código foi "true" e o bloco foi executado. Logo abaixo, temos outros "IFs" onde os mesmos serão
        // avaliados e considerados "falsos", por consequência, o "else" será executado.


        // ******* ******* ** ******* ******* ** ******* ******* ** ******* ******* **

        // Um jeito mais inteligente de se fazer as coisas.
        /*
            Vamos fazer um sistema que, de acordo com a idade da pessoa, será dito
            a categoria dela no futebol, mas usaremos variáveis desta vez.
        */
        String categoria;
        int idadePessoa = 30;

        if (idadePessoa <= 15)
        {
            categoria = "Infantil";
        } else if (idadePessoa >= 16 && idadePessoa <= 18)
        {
            categoria = "Juvenil";
        } else if (idadePessoa >= 19)
        {
            categoria = "Adulta";
        }
        else
        {
            categoria = "Não definida"; // Tratamento para o caso de nenhuma condição ser atendida
        }
        System.out.println("Sua categoria é: " + categoria);

        // Neste caso, existe uma pequena chance de tentarmos usar uma variável sem valor definido. Portanto, SOMOS OBRIGADOS a utilizar o "else".
        // O motivo é que nossa variável (categoria) não possui valor por padrão, ou seja, foi declarada, mas não inicializada.

        // Quando não incluímos o "else", o compilador raciocina da seguinte forma:
        // "E se nenhuma condição for avaliada como verdadeira? A variável continuará sem valor, e você tentará usá-la."

        // Então, se não utilizarmos o 'else' nesse contexto, teremos o seguinte erro:
        // java: variable categoria might not have been initialized

        // Isso significa que "A variável 'categoria' PODE não ter sido inicializada."
        // De fato, se não utilizarmos o "else", a variável pode não ser inicializada. Como o compilador não sabe se as outras condições são verdadeiras ou não, sempre retornará esse erro caso não haja o 'else' no código.

    }
}
