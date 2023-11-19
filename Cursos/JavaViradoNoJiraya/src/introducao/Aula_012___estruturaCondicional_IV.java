// ESTRUTURA CONDICIONAL: SWITCH CASE
/*
    O switch case é utilizado como se fosse um 'if/else..', porém, apenas para condições de igualdade.

    Ao lado da palavra-chave "switch", colocaremos parênteses, e dentro deles, colocaremos algum valor, sendo ele:
    byte, short, int, long, char ou String (vemos que não é aceito valores booleanos)

    Dentro da estrutura, usaremos a palavra-chave "case".
    Caso haja correspondência entre algum CASE em relação ao valor que foi passado para o switch, as instruções
    associadas a esse caso serão executadas.
*/
package introducao;

public class Aula_012___estruturaCondicional_IV {
    public static void main(String[] args) {

        // Aqui definimos o valor que será usado pelos "cases"
        switch ("João") {
            // caso este "case" tenha o mesmo valor colocado lá em cima, essas instruções serão executadas
            case "Maria":
                System.out.println("Seu apelido pode ser 'Ma' ");
                break;

            case "João":
                System.out.println("Seu apelido pode ser Jojo");
                break;
        }

        // POR QUE USAMOS O BREAK?
        /*
            O "break" significa "quebrar", "interromper". Isto é, se não colocássemos ele nas instruções dos nossos "cases",
            as próximas instruções, de outros cases, seriam executadas também. O "break" define
            que não haverá mais instruções para aquele caso.
        */
        // EXEMPLO
        switch ("Julia") {
            case "Maria":
                System.out.println("Seu apelido pode ser 'Ma' ");

            case "João":
                System.out.println("Seu apelido pode ser Jo");

            case "Julia":
                System.out.println("Seu apelido pode ser Ju");

            case "Roberta":
                System.out.println("Seu apelido pode ser Betinha");
        }
        // OUTPUT:
        // "Seu apelido pode ser Ju"
        // "Sey apelido pode ser Betinha"

        // A primeira string faz total sentido ser printada, pois o caso "Julia" correspondeu com o valor do switch "Julia".
        // Mas a segunda não faz. O problema é que, como não foi colocado o "break" no 'case "Julia": ..',
        // os próximos casos são considerados instruções do 'case julia'.


        // ** ***** ** ***** ** ***** ** ***** ** ***** ** ***** ** ***** ** *****


        // Mas e se nenhum caso corresponder ao valor do switch?
        // Neste caso, temos o 'default' que se equivale ao "else".

        int num = 3;
        switch(num) {
            case 1:
                System.out.println(" =) ");
                break;

            case 2:
                System.out.println(" (= ");
                break;

            default:
                System.out.println("Nenhum caso anterior correspondeu ao valor do switch (num) =( ");
        }
        // output: "Nenhum caso anterior correspondeu ao valor do switch (num) =( "


        // ** ***** ** ***** ** ***** ** ***** ** ***** ** ***** ** ***** ** *****


        // Simplificando a estrutura quando casos diferentes retornam a mesma coisa.

        // EXEMPLO
        /*
            Eu tenho preferência pelos números: 4, 5, 6 e 7; portanto, criarei um pequeno programa que imprime um emoticon feliz
            se um desses números for escolhido. Caso seja qualquer outro número, será um emoticon triste.
        */
        byte numeroDaSorte = 5;

        switch (numeroDaSorte)
        {
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("  (=  ");
                break;

            default:
                System.out.println("  =(   ");
        }

        /*
            Lembrando o que foi mencionado: quando não utilizamos o 'break' em um 'case', os próximos 'cases' também serão
            executados, como instruções. Podemos aproveitar isso a nosso favor. Por exemplo, se o valor da variável for '4',
            o 'case 4' será executado, que executará o 5, seguido pelo 6 e, por fim, o 'case 7', resultando na impressão do
            emoticon feliz.

            Se o número escolhido for 5, o 'case 5' será executado, levando à execução do 'case 6', que por sua vez
            executará o 'case 7', resultando novamente na impressão do emoticon feliz.
        */

        // MAS TAMBÉM PODEMOS FAZER DESTA FORMA (MAS FIQUE ATENTO POIS ELA NÃO É SUPORTADA EM VERSOES ANTIGAS DO JAVA):
        byte numeroSorte = 5;

//        switch (numeroSorte)
//        {
//            case 4, 5, 6, 7:
//                System.out.println("  (=  ");
//                break;
//
//            default:
//                System.out.println("  =(   ");
//        }


    }
}
